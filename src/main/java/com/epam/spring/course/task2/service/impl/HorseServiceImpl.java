package com.epam.spring.course.task2.service.impl;

import com.epam.spring.course.task2.domain.Horse;
import com.epam.spring.course.task2.provider.BreedDataProvider;
import com.epam.spring.course.task2.provider.RiderDataProvider;
import com.epam.spring.course.task2.service.HorseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * Default comment.
 **/
@Service
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

    @Autowired
    public void setBreedDataProvider(BreedDataProvider breedDataProvider) {
        this.breedDataProvider = breedDataProvider;
    }

    @Autowired
    public void setRiderDataProvider(RiderDataProvider dataProvider) {
        this.riderDataProvider = dataProvider;
    }
}
