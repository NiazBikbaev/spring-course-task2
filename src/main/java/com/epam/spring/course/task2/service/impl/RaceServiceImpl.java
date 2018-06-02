package com.epam.spring.course.task2.service.impl;

import com.epam.spring.course.task2.domain.Horse;
import com.epam.spring.course.task2.domain.Race;
import com.epam.spring.course.task2.service.HorseService;
import com.epam.spring.course.task2.service.RaceService;

import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Default comment.
 **/
public class RaceServiceImpl implements RaceService {

    private HorseService horseService;

    private List<Race> raceList;

    private void init() {
        raceList = Stream.generate(() -> {
            List<Horse> collect = Stream.generate(horseService::getHorse)
                    .limit(20)
                    .collect(Collectors.toList());
            return new Race(collect);
        }).limit(10).collect(Collectors.toList());
    }

    @Override
    public Optional<Race> getRace() {
        Collections.shuffle(raceList);
        return raceList.stream().findAny();
    }

    /**
     * Setter for horseService.
     *
     * @param horseService value
     */
    public void setHorseService(HorseService horseService) {
        this.horseService = horseService;
    }
}
