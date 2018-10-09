package ru.aazizova.patterns.abstract_factory.factories;

import ru.aazizova.patterns.abstract_factory.buttons.Button;
import ru.aazizova.patterns.abstract_factory.checkboxes.Checkbox;

/**
 * Created by aazizova on 09.10.2018.
 *
 * Абстрактная фабрика знает обо всех (абстрактных) типах продуктов.
 *
 */
public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
