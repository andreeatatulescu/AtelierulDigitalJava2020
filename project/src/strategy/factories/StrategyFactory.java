package strategy.factories;

import strategy.Flight;
import strategy.interfaces.FlightStrategy;
import strategy.strategies.DestinationStrategy;
import strategy.strategies.PriceStrategy;
import strategy.strategies.RatingStrategy;

import java.util.List;

public class StrategyFactory {

    private StrategyFactory() {
    }

    public static FlightStrategy createStrategy(String strategyType, List<Flight> flights) {
        if (strategyType.equals("RATING")) {
            return new RatingStrategy(flights);
        } else if (strategyType.equals("PRICE")) {
            return new PriceStrategy(flights);
        } else if (strategyType.equals("DESTINATION")) {
            return new DestinationStrategy(flights);
        }
        return null;
    }
}
