package com.epam.spring.course.task2.domain;

import java.util.Objects;

/**
 * Rider domain class.
 **/
public class Rider {
    private String name;

    public Rider(String name) {
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
        if (!(o instanceof Rider)) return false;
        Rider rider = (Rider) o;
        return Objects.equals(name, rider.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name);
    }
}
