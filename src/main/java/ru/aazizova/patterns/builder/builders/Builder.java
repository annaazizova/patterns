package ru.aazizova.patterns.builder.builders;

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
public interface Builder {
    void setType(Type type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);



}
