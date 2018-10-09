package ru.aazizova.patterns.factory_method.factory;

import ru.aazizova.patterns.factory_method.buttons.Button;
import ru.aazizova.patterns.factory_method.buttons.HtmlButton;

/**
 * Created by aazizova on 09.10.2018.
 *
 * HTML-диалог.
 */
public class HtmlDialog extends Dialog{
    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
