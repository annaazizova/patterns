package ru.aazizova.patterns.abstract_factory.factories;

import ru.aazizova.patterns.abstract_factory.buttons.Button;
import ru.aazizova.patterns.abstract_factory.buttons.WindowsButton;
import ru.aazizova.patterns.abstract_factory.checkboxes.Checkbox;
import ru.aazizova.patterns.abstract_factory.checkboxes.WindowsCheckbox;

/**
 * Created by aazizova on 09.10.2018.
 *
 * Каждая конкретная фабрика знает и создаёт только продукты своей вариации.
 */
public class WindowsFactory implements GUIFactory{
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
