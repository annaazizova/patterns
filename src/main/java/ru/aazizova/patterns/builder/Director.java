package ru.aazizova.patterns.builder;

import ru.aazizova.patterns.builder.builders.Builder;
import ru.aazizova.patterns.builder.cars.Type;
import ru.aazizova.patterns.builder.components.Engine;
import ru.aazizova.patterns.builder.components.GPSNavigator;
import ru.aazizova.patterns.builder.components.Transmission;
import ru.aazizova.patterns.builder.components.TripComputer;

/**
 * Created by aazizova on 09.10.2018.
 *
 * Директор знает в какой последовательности заставлять работать строителя. Он
 * работает с ним через общий интерфейс Строителя. Из-за этого, он может не
 * знать какой конкретно продукт сейчас строится.
 *
 */
public class Director {
    public void constructSportsCar(Builder builder){
        builder.setType(Type.SPORTS_CAR);
        builder.setSeats(2);
        builder.setEngine(new Engine(3.0, 0));
        builder.setTransmission(Transmission.SEMI_AUTOMATIC);
        builder.setTripComputer(new TripComputer());
        builder.setGPSNavigator(new GPSNavigator());
    }

    public void constructCityCar(Builder builder){
        builder.setType(Type.CITY_CAR);
        builder.setSeats(2);
        builder.setEngine(new Engine(1.2, 0));
        builder.setTransmission(Transmission.AUTOMATIC);
        builder.setTripComputer(new TripComputer());
        builder.setGPSNavigator(new GPSNavigator());
    }

    public void constructSUV(Builder builder) {
        builder.setType(Type.SUV);
        builder.setSeats(4);
        builder.setEngine(new Engine(2.5, 0));
        builder.setTransmission(Transmission.MANUAL);
        builder.setGPSNavigator(new GPSNavigator());
    }
}
