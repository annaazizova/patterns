package ru.aazizova.patterns.builder.components;

/**
 * Created by aazizova on 09.10.2018.
 *
 * Одна из фишек автомобиля.
 *
 */
public class GPSNavigator {
    private String route;

    public GPSNavigator(){
        this.route = "221b, Baker Street, London  to Scotland Yard, 8-10 Broadway, London";
    }

    public GPSNavigator(String manualRoute){
        this.route = manualRoute;
    }

    public String getRoute(){
        return route;
    }
}
