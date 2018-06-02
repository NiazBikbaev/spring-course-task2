package com.epam.spring.course.task2.provider;

import com.epam.spring.course.task2.domain.Rider;

import java.util.Optional;

/**
 * Default comment.
 **/
public interface RiderDataProvider {
    Optional<Rider> getRider();
}
