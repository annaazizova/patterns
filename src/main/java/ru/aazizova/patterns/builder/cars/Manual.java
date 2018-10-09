package ru.aazizova.patterns.builder.cars;

import ru.aazizova.patterns.builder.components.Engine;
import ru.aazizova.patterns.builder.components.GPSNavigator;
import ru.aazizova.patterns.builder.components.Transmission;
import ru.aazizova.patterns.builder.components.TripComputer;

/**
 * Created by aazizova on 09.10.2018.
 *
 * Руководство автомобиля — это второй продукт. Заметьте, что руководство и сам
 * автомобиль не имеют общего родительского класса. По сути, они независимы.
 */
public class Manual {
    private final Type type;
    private final int seats;
    private final Engine engine;
    private final Transmission transmission;
    private final TripComputer tripComputer;
    private final GPSNavigator gpsNavigator;

    public Manual(Type type, int seats, Engine engine, Transmission transmission,
                  TripComputer tripComputer, GPSNavigator gpsNavigator) {
        this.type = type;
        this.seats = seats;
        this.engine = engine;
        this.transmission = transmission;
        this.tripComputer = tripComputer;
        this.gpsNavigator = gpsNavigator;
    }

    public String print() {
        String info = "";
        info += "Type of car: " + type + "\n";
        info += "Count of seats: " + seats + "\n";
        info += "Engine: volume - " + engine.getVolume() + "; mileage - " + engine.getMileage() + "\n";
        info += "Transmission: " + transmission + "\n";
        if (this.tripComputer != null) {
            info += "Trip Computer: Functional" + "\n";
        } else {
            info += "Trip Computer: N/A" + "\n";
        }
        if (this.gpsNavigator != null) {
            info += "GPS Navigator: Functional" + "\n";
        } else {
            info += "GPS Navigator: N/A" + "\n";
        }
        return info;
    }
}
