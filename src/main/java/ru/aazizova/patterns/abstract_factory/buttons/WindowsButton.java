package ru.aazizova.patterns.abstract_factory.buttons;

/**
 * Created by aazizova on 09.10.2018.
 */
public class WindowsButton implements Button {
    @Override
    public void paint() {
        System.out.println("You have created WindowsButton");
    }
}
