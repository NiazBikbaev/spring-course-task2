package com.epam.spring.course.task2.provider.impl;

import com.epam.spring.course.task2.domain.Breed;
import com.epam.spring.course.task2.provider.BreedDataProvider;

import javax.annotation.PostConstruct;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * Default comment.
 **/
public class BreedDataProviderImpl implements BreedDataProvider {
    private List<String> breed;

    private List<Breed> data;

    @PostConstruct
    private void init() {
        data = breed.stream()
                .map(Breed::new)
                .collect(Collectors.toList());
    }

    @Override
    public Optional<Breed> getBreed() {
        Collections.shuffle(data);
        return data.stream()
                .findAny();
    }

    public void setBreed(List<String> breed) {
        this.breed = breed;
    }
}
