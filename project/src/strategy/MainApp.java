package strategy;

import strategy.factories.StrategyFactory;
import strategy.interfaces.FlightStrategy;

import java.util.ArrayList;
import java.util.List;

public class MainApp {
    public static void main(String[] args) {
        List<Flight> flights = new ArrayList<>();
        Flight flight1 = new Flight("Maldives", 4.68, 2000, "WizzAir");
        Flight flight2 = new Flight("Bahamas", 4.23, 2000, "WizzAir");
        Flight flight3 = new Flight("Maldives", 4.70, 2200, "WizzAir");
        Flight flight4 = new Flight("Maldives", 4.70, 2100, "WizzAir");

        flights.add(flight1);
        flights.add(flight2);
        flights.add(flight3);
        flights.add(flight4);

        FlightStrategy flightStrategy1 = StrategyFactory.createStrategy("DESTINATION", flights);
        flightStrategy1.sortBy();
        System.out.println(flights + "\n");

        FlightStrategy flightStrategy2 = StrategyFactory.createStrategy("PRICE", flights);
        flightStrategy2.sortBy();
        System.out.println(flights + "\n");

        FlightStrategy flightStrategy3 = StrategyFactory.createStrategy("RATING", flights);
        flightStrategy3.sortBy();
        System.out.println(flights + "\n");
    }
}
