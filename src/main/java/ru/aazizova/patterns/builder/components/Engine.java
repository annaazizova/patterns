package ru.aazizova.patterns.builder.components;

/**
 * Created by aazizova on 09.10.2018.
 *
 * Одна из фишек автомобиля.
 */
public class Engine {
    private final double volume;
    private double mileage;
    private boolean started;

    public Engine(double volume, double mileage){
        this.volume = volume;
        this.mileage = mileage;
    }

    public void on(){
        started = true;
    }

    public void off(){
        started = false;
    }

    public boolean isStarted(){
        return started;
    }

    public void go(double mileage){
        if(isStarted()){
            this.mileage += mileage;
        } else {
            System.out.println("Can't go(), you must start engine first!");
        }
    }

    public double getVolume(){
        return volume;
    }

    public double getMileage(){
        return mileage;
    }
}
