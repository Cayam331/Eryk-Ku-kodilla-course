package com.kodilla.good.patterns.challenges.Task_9_5;

public class ArrivalAirport {
    private String arrivalCity;


    public ArrivalAirport(String arrivalCity) {
        this.arrivalCity = arrivalCity;
    }

    public String getArrivalCity() {
        return arrivalCity;
    }

    @Override
    public String toString() {
        return arrivalCity + " ";
    }
}
