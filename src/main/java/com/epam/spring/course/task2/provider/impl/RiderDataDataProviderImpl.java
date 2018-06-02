package com.epam.spring.course.task2.provider.impl;

import com.epam.spring.course.task2.domain.Rider;
import com.epam.spring.course.task2.provider.RiderDataProvider;

import javax.annotation.PostConstruct;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * Default comment.
 **/
public class RiderDataDataProviderImpl implements RiderDataProvider {

    private List<String> rider;

    private List<Rider> data;

    @PostConstruct
    private void init() {
        data = rider.stream()
                .map(Rider::new)
                .collect(Collectors.toList());
    }

    @Override
    public Optional<Rider> getRider() {
        Collections.shuffle(data);
        return data.stream()
                .findAny();
    }

    /**
     * Setter for rider.
     *
     * @param rider value
     */
    public void setRider(List<String> rider) {
        this.rider = rider;
    }

}
