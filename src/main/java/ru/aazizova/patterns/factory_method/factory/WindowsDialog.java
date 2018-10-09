package ru.aazizova.patterns.factory_method.factory;

import ru.aazizova.patterns.factory_method.buttons.Button;
import ru.aazizova.patterns.factory_method.buttons.WindowsButton;

/**
 * Created by aazizova on 09.10.2018.
 *
 * Диалог на элементах операционной системы.
 */
public class WindowsDialog extends Dialog {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
