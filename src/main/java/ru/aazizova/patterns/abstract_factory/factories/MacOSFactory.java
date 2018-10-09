package ru.aazizova.patterns.abstract_factory.factories;

import ru.aazizova.patterns.abstract_factory.buttons.Button;
import ru.aazizova.patterns.abstract_factory.buttons.MacOSButton;
import ru.aazizova.patterns.abstract_factory.checkboxes.Checkbox;
import ru.aazizova.patterns.abstract_factory.checkboxes.MacOSCheckbox;

/**
 * Created by aazizova on 09.10.2018.
 *
 * Каждая конкретная фабрика знает и создаёт только продукты своей вариации.
 *
 */
public class MacOSFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}
