package com.epam.spring.course.task2.domain;


import java.util.List;
import java.util.Objects;

/**
 * Race domain class.
 **/
public class Race {

    private List<Horse> horses;

    public Race(List<Horse> horses) {
        this.horses = horses;
    }

    /**
     * Getter for horses.
     *
     * @return java.util.List<com.epam.spring.course.task2.domain.Horse>
     */
    public List<Horse> getHorses() {
        return horses;
    }

    /**
     * Setter for horses.
     *
     * @param horses value
     */
    public void setHorses(List<Horse> horses) {
        this.horses = horses;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Race)) return false;
        Race race = (Race) o;
        return Objects.equals(horses, race.horses);
    }

    @Override
    public int hashCode() {

        return Objects.hash(horses);
    }
}
