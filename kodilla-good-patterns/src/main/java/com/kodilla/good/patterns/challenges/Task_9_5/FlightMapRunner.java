package com.kodilla.good.patterns.challenges.Task_9_5;

public class FlightMapRunner {
    public static void main(String args[]){
     FlightSchedule flightSchedule = new FlightSchedule(DataLoader.loadFlightOneSchedule());
     flightSchedule.findFlightFromCity("Kraków");
     flightSchedule.findFlightToCity("Warszawa");
     flightSchedule.findFlighThroughCity("Kraków", "Warszawa", "Madryt");



    }
}
