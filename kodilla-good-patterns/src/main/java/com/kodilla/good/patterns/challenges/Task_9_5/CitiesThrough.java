package com.kodilla.good.patterns.challenges.Task_9_5;

import java.util.ArrayList;
import java.util.List;

public class CitiesThrough {
    private List<String> citiesThrough = new ArrayList<>();

    public List<String> getCitiesThrough() {
        return citiesThrough;
    }

    public CitiesThrough(List<String> citiesThrough) {

        this.citiesThrough = citiesThrough;
    }

    @Override
    public String toString() {
        return "cities through: "+ citiesThrough;

    }
}
