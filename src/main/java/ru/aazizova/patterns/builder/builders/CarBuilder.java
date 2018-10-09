package ru.aazizova.patterns.builder.builders;

import ru.aazizova.patterns.builder.cars.Car;
import ru.aazizova.patterns.builder.cars.Type;
import ru.aazizova.patterns.builder.components.Engine;
import ru.aazizova.patterns.builder.components.GPSNavigator;
import ru.aazizova.patterns.builder.components.Transmission;
import ru.aazizova.patterns.builder.components.TripComputer;

/**
 * Created by aazizova on 09.10.2018.
 *
 * Интерфейс Строителя объявляет все возможные этапы и шаги конфигурации
 * продукта.
 */
public class CarBuilder implements Builder {
    private Type type;
    private int seats;
    private Engine engine;
    private Transmission transmission;
    private TripComputer tripComputer;
    private GPSNavigator gpsNavigator;

    @Override
    public void setType(Type type) {
        this.type = type;
    }

    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void setTransmission(Transmission transmission) { this.transmission = transmission; }

    @Override
    public void setTripComputer(TripComputer tripComputer) {
        this.tripComputer = tripComputer;
    }

    @Override
    public void setGPSNavigator(GPSNavigator gpsNavigator) {
        this.gpsNavigator = gpsNavigator;
    }

    public Car getResult(){
        return new Car(type, seats, engine, transmission, tripComputer, gpsNavigator);
    }
}
