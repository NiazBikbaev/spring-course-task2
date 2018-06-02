package com.epam.spring.course.task2.service.impl;

import com.epam.spring.course.task2.domain.Horse;
import com.epam.spring.course.task2.provider.BreedDataProvider;
import com.epam.spring.course.task2.provider.RiderDataProvider;
import com.epam.spring.course.task2.service.HorseService;

/**
 * Default comment.
 **/
public class HorseServiceImpl implements HorseService {

    private BreedDataProvider breedDataProvider;
    private RiderDataProvider riderDataProvider;


    @Override
    public Horse getHorse() {
        Horse horse = new Horse();
        if (riderDataProvider.getRider().isPresent()
                && breedDataProvider.getBreed().isPresent()) {
            horse.setBreed(breedDataProvider.getBreed().get());
            horse.setRider(riderDataProvider.getRider().get());
        }
        return horse;
    }

    public void setBreedDataProvider(BreedDataProvider breedDataProvider) {
        this.breedDataProvider = breedDataProvider;
    }

    public void setRiderDataProvider(RiderDataProvider dataProvider) {
        this.riderDataProvider = dataProvider;
    }
}
