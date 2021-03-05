package strategy.strategies;

import strategy.Flight;
import strategy.interfaces.FlightStrategy;

import java.util.Comparator;
import java.util.List;

public class PriceStrategy implements FlightStrategy {
    private List<Flight> flights;

    public PriceStrategy(List<Flight> flights) {
        this.flights = flights;
    }

    /**
     * sorting by price and after that by rating in reversed order
     */
    @Override
    public void sortBy() {
        flights.sort(Comparator.comparing(Flight::getPrice)
                .thenComparing(Flight::getRating, Comparator.reverseOrder()));
    }
}
