package ru.aazizova.patterns.factory_method.buttons;

/**
 * Created by aazizova on 09.10.2018.
 *
 * Общий интерфейс для всех продуктов.
 */
public interface Button {
    void render();
    void onClick();
}
