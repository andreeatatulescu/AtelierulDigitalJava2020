package strategy.strategies;

import strategy.Flight;
import strategy.interfaces.FlightStrategy;

import java.util.Comparator;
import java.util.List;

public class DestinationStrategy implements FlightStrategy {
    private List<Flight> flights;

    public DestinationStrategy(List<Flight> flights) {
        this.flights = flights;
    }


    /**
     * sorting by destination, after that by rating in reversed order, after that by price
     */
    @Override
    public void sortBy() {
        flights.sort(Comparator.comparing(Flight::getDestination)
                .thenComparing(Flight::getRating, Comparator.reverseOrder())
                .thenComparing(Flight::getPrice));
    }
}
