package com.epam.spring.course.task2.domain;

import java.util.Objects;

/**
 * Horse domain comment.
 **/
public class Horse {
    private Breed breed;
    private Rider rider;

    /**
     * Getter for breed.
     *
     * @return com.epam.spring.course.task2.domain.Breed
     */
    public Breed getBreed() {
        return breed;
    }

    /**
     * Setter for breed.
     *
     * @param breed value
     */
    public void setBreed(Breed breed) {
        this.breed = breed;
    }

    /**
     * Getter for rider.
     *
     * @return com.epam.spring.course.task2.domain.Rider
     */
    public Rider getRider() {
        return rider;
    }

    /**
     * Setter for rider.
     *
     * @param rider value
     */
    public void setRider(Rider rider) {
        this.rider = rider;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Horse)) return false;
        Horse horse = (Horse) o;
        return Objects.equals(breed, horse.breed) &&
                Objects.equals(rider, horse.rider);
    }

    @Override
    public int hashCode() {

        return Objects.hash(breed, rider);
    }

    @Override
    public String toString() {
        return "Horse{" +
                "breed=" + breed.getName() +
                ", rider=" + rider.getName() +
                '}';
    }
}
