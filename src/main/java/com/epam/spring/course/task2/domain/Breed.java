package com.epam.spring.course.task2.domain;

import java.util.Objects;

/**
 * Default comment.
 **/
public class Breed {
    private String name;

    public Breed(String name) {
        this.name = name;
    }

    /**
     * Getter for name.
     *
     * @return java.lang.String
     */
    public String getName() {
        return name;
    }

    /**
     * Setter for name.
     *
     * @param name value
     */
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Breed)) return false;
        Breed breed = (Breed) o;
        return Objects.equals(name, breed.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name);
    }
}
