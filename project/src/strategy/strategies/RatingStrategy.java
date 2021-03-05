package strategy.strategies;

import strategy.Flight;
import strategy.interfaces.FlightStrategy;

import java.util.Comparator;
import java.util.List;

public class RatingStrategy implements FlightStrategy {
    private List<Flight> flights;

    public RatingStrategy(List<Flight> flights) {
        this.flights = flights;
    }

    /**
     * sorting by rating in reversed order and after that by price
     */
    @Override
    public void sortBy() {
        flights.sort(Comparator.comparing(Flight::getRating, Comparator.reverseOrder())
                .thenComparing(Flight::getPrice));
    }
}
