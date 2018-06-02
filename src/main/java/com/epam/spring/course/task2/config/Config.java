package com.epam.spring.course.task2.config;

import com.epam.spring.course.task2.provider.BreedDataProvider;
import com.epam.spring.course.task2.provider.RiderDataProvider;
import com.epam.spring.course.task2.provider.impl.BreedDataProviderImpl;
import com.epam.spring.course.task2.provider.impl.RiderDataDataProviderImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

/**
 * Default comment.
 **/
@Configuration
@ComponentScan("com.epam.spring.course.task2.*")
public class Config {

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

}
