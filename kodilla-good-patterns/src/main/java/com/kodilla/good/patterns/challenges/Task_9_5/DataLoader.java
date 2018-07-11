package com.kodilla.good.patterns.challenges.Task_9_5;

import java.util.ArrayList;
import java.util.HashMap;

public class DataLoader {
    public static ArrayList<String> loadCitiesThroughOne(){
        ArrayList<String> flightOneCities = new ArrayList<>();
        flightOneCities.add("Moskwa");
        flightOneCities.add("Madryt");
        flightOneCities.add("Rzym");
        flightOneCities.add("Gdańsk");
        return flightOneCities;
    }
    public static ArrayList<String> loadCitiesThroughTwo() {
        ArrayList<String> flightTwoCities = new ArrayList<>();
        flightTwoCities.add("Wrocław");
        flightTwoCities.add("Gdańsk");
        flightTwoCities.add("Warszawa");
        flightTwoCities.add("Kraków");
        return flightTwoCities;
    }
    public static ArrayList<String> loadCitiesThroughThree() {
        ArrayList<String> flightThreeCities = new ArrayList<>();
        flightThreeCities.add("Berlin");
        flightThreeCities.add("Amsterdam");
        flightThreeCities.add("Rzeszow");
        flightThreeCities.add("Gdańsk");
        return flightThreeCities;
    }
    public static String loadArrivalAirportOne(){
        return "Warszawa";
    }
    public static String loadArrivalAirportTwo(){
        return "Berlin";
    }
    public static String loadArrivalAirportThree(){
        return "Barcelona";
    }
    public static String loadDepartureAirportOne(){
        return "Kraków";
    }
    public static String loadDepartureAirportTwo(){
        return "Kabul";
    }
    public static String loadDepartureAirportThree(){
        return "Tirana";
    }
    public static HashMap<DepartureAirport, DestinationThrough> loadFlightOneSchedule(){
        DepartureAirport departureAirportOne = new DepartureAirport(DataLoader.loadDepartureAirportOne());
        DestinationThrough destinationThroughOne =  new DestinationThrough(new ArrivalAirport(DataLoader.loadArrivalAirportOne()),new CitiesThrough(DataLoader.loadCitiesThroughOne()));

        DepartureAirport departureAirportTwo = new DepartureAirport(DataLoader.loadDepartureAirportTwo());
        DestinationThrough destinationThroughTwo =  new DestinationThrough(new ArrivalAirport(DataLoader.loadArrivalAirportTwo()),new CitiesThrough(DataLoader.loadCitiesThroughTwo()));

        DepartureAirport departureAirportThree = new DepartureAirport(DataLoader.loadDepartureAirportThree());
        DestinationThrough destinationThroughThree =  new DestinationThrough(new ArrivalAirport(DataLoader.loadArrivalAirportThree()),new CitiesThrough(DataLoader.loadCitiesThroughThree()));


        HashMap<DepartureAirport, DestinationThrough> resultMap = new HashMap<>();
        resultMap.put(departureAirportOne, destinationThroughOne);
        resultMap.put(departureAirportTwo, destinationThroughTwo);
        resultMap.put(departureAirportThree, destinationThroughThree);


        return  resultMap;

    }
}
