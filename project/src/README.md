# Final Project GAD_JAVA_2020

Tatulescu Diana-Andreea

## Scenario

Choose 2 design patterns that you like and provide concrete implementation for them.

Try to find real world scenarios to apply the design patterns and also bear in mind that "design pattern" is a solution 
to a problem in a given context.

Also you should be able to describe the problem you are fixing by using the design pattern of your choice.

## Run 

Class observer.MainApp and strategy.MainApp

## Observer Pattern

	This is an idea of traffic monitor. In fact, each driver represents an observer 
    of the traffic lights from streets, intersections, etc and in order to reduce
    the accidents caused by speed or simply distraction while driving, I thought 
    about how the drivers could be warned about the change of the light.

    Of course, in order to transform this project into reality, we need cars with
    artificial intelligence, but it is a really good solution if we think about the 
    future because the negligence while driving is a real world problem.

## Strategy Pattern

    This is a solution when you have to choose the most advantageous plan for your
    holiday. Brefly, this works like a filter which sort all your possibilies by
    different criteria. I have implemented the filter for destination, rating and 
    price for a list of flights. I have also used in my implementation the Factory 
    Pattern in order to be easier to extend the project later by adding more
    strategies.


### Structure

```
src
|___
    |__observer
    |  |____Driver
    |  |____TrafficLight
    |  |____MainApp
    |
    |__strategy
        |____
        |__factories
        |  |__StrategyFactory
        |
        |__interfaces
        |  |__FlightStrategy
        |
        |__strategies
        |  |__RatingStrategy (sorting by rating, by price)
        |  |__PriceStrategy (sorting by price, by rating)
        |  |__DestinationStrategy (sorting by destination, by rating, by price)
        |
        |__MainApp
        |
        |__Flight
    
```