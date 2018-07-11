package com.kodilla.good.patterns.challenges.Task_9_5;

public class DestinationThrough {
    ArrivalAirport arrivalAirport;
    CitiesThrough citiesThrough;

    public DestinationThrough(ArrivalAirport arrivalAirport, CitiesThrough citiesThrough) {
        this.arrivalAirport = arrivalAirport;
        this.citiesThrough = citiesThrough;
    }

    public ArrivalAirport getArrivalAirport() {
        return arrivalAirport;
    }

    public CitiesThrough getCitiesThrough() {
        return citiesThrough;
    }

    @Override
    public String toString() {
        return "arrival airport: " + arrivalAirport +
                "" + citiesThrough;
    }
}