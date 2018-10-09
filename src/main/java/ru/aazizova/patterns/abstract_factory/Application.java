package ru.aazizova.patterns.abstract_factory;

import ru.aazizova.patterns.abstract_factory.buttons.Button;
import ru.aazizova.patterns.abstract_factory.checkboxes.Checkbox;
import ru.aazizova.patterns.abstract_factory.factories.GUIFactory;

/**
 * Created by aazizova on 09.10.2018.
 *
 *  Код, использующий фабрику, не волнует с какой конкретно фабрикой он работает.
 *  Все получатели продуктов работают с продуктами через абстрактный интерфейс.
 */
public class Application {
    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory factory){
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void paint(){
        button.paint();
        checkbox.paint();
    }
}
