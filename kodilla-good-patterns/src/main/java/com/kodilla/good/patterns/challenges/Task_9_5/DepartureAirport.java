package com.kodilla.good.patterns.challenges.Task_9_5;

import java.util.Objects;

public class DepartureAirport {
    private String city;

    public DepartureAirport(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DepartureAirport that = (DepartureAirport) o;
        return Objects.equals(getCity(), that.getCity());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getCity());
    }

    @Override
    public String toString() {
        return "DepartureAirport: " + city + " ";

    }
}
