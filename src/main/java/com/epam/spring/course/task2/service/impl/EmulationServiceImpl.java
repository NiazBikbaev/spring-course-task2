package com.epam.spring.course.task2.service.impl;

import com.epam.spring.course.task2.domain.Horse;
import com.epam.spring.course.task2.domain.Race;
import com.epam.spring.course.task2.service.EmulationService;
import com.epam.spring.course.task2.service.RaceService;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Default comment.
 **/
public class EmulationServiceImpl implements EmulationService {

    private RaceService raceService;

    @Override
    public Race getNextRace() {
        return raceService.getRace().orElse(null);
    }

    @Override
    public Horse emulate(Race race, int raceDuration) {
        Map<Horse, Integer> horseIntegerMap = new HashMap<>();
        generateVelocity(race, horseIntegerMap);
        emulate(raceDuration, horseIntegerMap);
        return Objects.requireNonNull(horseIntegerMap.entrySet().stream()
                .max(Comparator.comparing(Map.Entry::getValue))
                .orElse(null)).getKey();
    }

    private void emulate(int raceDuration, Map<Horse, Integer> horseIntegerMap) {
        for (int i = 0; i < raceDuration; i++) {
            System.out.println("======================================================");
            try {
                Thread.sleep(1000);
                final int finalI = i;
                horseIntegerMap.forEach((horse, integer) -> {
                    int position = integer * finalI;
                    System.out.println(horse + " || " + position);
                });
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private void generateVelocity(Race race, Map<Horse, Integer> horseIntegerMap) {
        race.getHorses().forEach((horse -> {
            int randomVelocity =
                    ThreadLocalRandom.current().nextInt(1, 100);
            horseIntegerMap.put(horse, randomVelocity);
        }));
    }

    public void setRaceService(RaceService raceService) {
        this.raceService = raceService;
    }
}
