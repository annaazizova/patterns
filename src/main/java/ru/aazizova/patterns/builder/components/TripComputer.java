package ru.aazizova.patterns.builder.components;

import ru.aazizova.patterns.builder.cars.Car;

/**
 * Created by aazizova on 09.10.2018.
 *
 * Одна из фишек автомобиля.
 *
 */
public class TripComputer {
    private Car car;

    public void setCar(Car car){
        this.car = car;
    }

    public void showFuelLevel(){
        System.out.println("Fuel level: " + car.getFuel());
    }

    public void showStatus(){
        if(this.car.getEngine().isStarted()){
            System.out.println("Car is started");
        } else {
            System.out.println("Car isn't started");
        }
    }
}
