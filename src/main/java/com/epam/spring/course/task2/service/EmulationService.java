package com.epam.spring.course.task2.service;

import com.epam.spring.course.task2.domain.Horse;
import com.epam.spring.course.task2.domain.Race;

public interface EmulationService {
    Race getNextRace();

    Horse emulate(Race race, int raceDuration);
}
