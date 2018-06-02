package com.epam.spring.course.task2.service;

import com.epam.spring.course.task2.domain.Race;

import java.util.Optional;

public interface RaceService {
    Optional<Race> getRace();
}
