package ru.aazizova.patterns.builder;

import ru.aazizova.patterns.builder.builders.CarBuilder;
import ru.aazizova.patterns.builder.builders.CarManualBuilder;
import ru.aazizova.patterns.builder.cars.Car;
import ru.aazizova.patterns.builder.cars.Manual;

/**
 * Created by aazizova on 09.10.2018.
 *
 * Демо-класс. Здесь всё сводится воедино.
 *
 */
public class Demo {
    public static void main(String[] args) {
        Director director = new Director();


        // Директор получает объект конкретного строителя от клиента
        // (приложения). Приложение само знает какой строитель использовать,
        // чтобы получить нужный продукт.
        CarBuilder carBuilder = new CarBuilder();
        director.constructSportsCar(carBuilder);

        // Готовый продукт возвращает строитель, так как Директор чаще всего не
        // знает и не зависит от конкретных классов строителей и продуктов.
        Car car = carBuilder.getResult();
        System.out.println("Car built:\n" + car.getType());

        CarManualBuilder manualBuilder = new CarManualBuilder();

        // Директор может знать больше одного рецепта строительства.
        director.constructSportsCar(manualBuilder);
        Manual carManual = manualBuilder.getResult();
        System.out.println("\nCar manual built:\n" + carManual.print());

    }
}
