package com.kodilla.good.patterns.challenges.Task_9_5;

import java.util.*;

public class FlightSchedule {
    public HashMap<DepartureAirport, DestinationThrough> flightsSchedule = new HashMap<>();

    public FlightSchedule(HashMap<DepartureAirport, DestinationThrough> flightsSchedule) {
        this.flightsSchedule = flightsSchedule;
    }

    public void findFlightFromCity(String city) {

        HashMap<DepartureAirport, DestinationThrough> result = new HashMap<>();
        flightsSchedule.entrySet().stream().filter(e -> e.getKey().getCity().equals(city)).forEach(entry -> result.put(entry.getKey(), entry.getValue()));

        Iterator it = result.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry) it.next();
            System.out.println(pair.getKey()+ " " + pair.getValue());
       }
    }
    public void findFlightToCity(String city) {

        HashMap<DepartureAirport, DestinationThrough> result = new HashMap<>();
        flightsSchedule.entrySet().stream().filter(e -> e.getValue().getArrivalAirport().getArrivalCity().equals(city)).forEach(entry -> result.put(entry.getKey(), entry.getValue()));

        Iterator it = result.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry) it.next();
            System.out.println(pair.getKey()+ " " + pair.getValue());
        }
    }
    public void findFlighThroughCity(String from, String to, String through) {

        HashMap<DepartureAirport, DestinationThrough> result = new HashMap<>();
        flightsSchedule.entrySet().stream().
                filter(e -> e.getKey().getCity().equals(from) && e.getValue().getArrivalAirport().getArrivalCity().equals(to) && e.getValue().getCitiesThrough().getCitiesThrough().contains(through)).
                forEach(entry -> result.put(entry.getKey(), entry.getValue()));

        Iterator it = result.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry) it.next();
            System.out.println(pair.getKey()+ " " + pair.getValue());
        }
    }
}
