package com.epam.spring.course.task2.provider;

import com.epam.spring.course.task2.domain.Breed;

import java.util.Optional;

/**
 * Default comment.
 **/
public interface BreedDataProvider {

    Optional<Breed> getBreed();
}
