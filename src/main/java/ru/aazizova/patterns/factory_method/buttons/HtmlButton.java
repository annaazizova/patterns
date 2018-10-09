package ru.aazizova.patterns.factory_method.buttons;

/**
 * Created by aazizova on 09.10.2018.
 */
public class HtmlButton implements Button {
    @Override
    public void render() {
        System.out.println("<button>Test Button</button>");
        onClick();
    }

    @Override
    public void onClick() {
        System.out.println("Click! Button says - 'Hello World!'");
    }
}
