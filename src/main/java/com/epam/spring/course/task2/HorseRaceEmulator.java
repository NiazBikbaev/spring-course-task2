package com.epam.spring.course.task2;

import com.epam.spring.course.task2.domain.Horse;
import com.epam.spring.course.task2.domain.Race;
import com.epam.spring.course.task2.service.EmulationService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;
import java.util.Scanner;

/**
 * Entry point.
 **/
public class HorseRaceEmulator {

    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("spring-config.xml");
        EmulationService emulationService =
                context.getBean("emulationService", EmulationService.class);
        Race nextRace = emulationService.getNextRace();
        List<Horse> horses = nextRace.getHorses();
        for (int i = 0; i < horses.size(); i++) {
            System.out.println((i + 1) + ". " + horses.get(i));
        }
        Scanner scanner = new Scanner(System.in);
        System.out.print("Make your bet: ");
        scanner.nextInt();
        Horse winner = emulationService.emulate(nextRace, 10);
        System.out.println("+++++++++++++++++++++++++++++++++++++++++");
        System.out.println("Winner: " + winner);
        System.out.println("+++++++++++++++++++++++++++++++++++++++++");
    }
}
