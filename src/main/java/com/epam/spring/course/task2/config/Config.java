package com.epam.spring.course.task2.config;

import com.epam.spring.course.task2.provider.BreedDataProvider;
import com.epam.spring.course.task2.provider.RiderDataProvider;
import com.epam.spring.course.task2.provider.impl.BreedDataProviderImpl;
import com.epam.spring.course.task2.provider.impl.RiderDataDataProviderImpl;
import com.epam.spring.course.task2.service.EmulationService;
import com.epam.spring.course.task2.service.HorseService;
import com.epam.spring.course.task2.service.RaceService;
import com.epam.spring.course.task2.service.impl.EmulationServiceImpl;
import com.epam.spring.course.task2.service.impl.HorseServiceImpl;
import com.epam.spring.course.task2.service.impl.RaceServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

/**
 * Default comment.
 **/
@Configuration
public class Config {

    @Bean
    public HorseService horseService() {
        HorseServiceImpl horseService = new HorseServiceImpl();
        horseService.setRiderDataProvider(riderDataProvider());
        horseService.setBreedDataProvider(breedDataProvider());
        return horseService;
    }

    @Bean
    public BreedDataProvider breedDataProvider() {
        BreedDataProviderImpl breedDataProvider = new BreedDataProviderImpl();
        breedDataProvider.setBreed(Arrays.asList("Mustang", "Brumby", "Bashkir horse"));
        return breedDataProvider;
    }

    @Bean
    public RiderDataProvider riderDataProvider() {
        RiderDataDataProviderImpl riderDataDataProvider = new RiderDataDataProviderImpl();
        riderDataDataProvider.setRider(Arrays.asList("John", "Paul", "Marat"));
        return riderDataDataProvider;
    }

    @Bean
    public RaceService raceService() {
        RaceServiceImpl raceService = new RaceServiceImpl();
        raceService.setHorseService(horseService());
        return raceService;
    }

    @Bean
    public EmulationService emulationService() {
        EmulationServiceImpl emulationService = new EmulationServiceImpl();
        emulationService.setRaceService(raceService());
        return emulationService;
    }
}
