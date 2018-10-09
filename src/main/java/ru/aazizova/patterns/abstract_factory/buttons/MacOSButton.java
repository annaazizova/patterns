package ru.aazizova.patterns.abstract_factory.buttons;

/**
 * Created by aazizova on 09.10.2018.
 *
 * Все семейства продуктов имеют одни и те же вариации (MacOS/Windows).
 *
 * Это вариант кнопки под MacOS.
 */
public class MacOSButton implements Button{

    @Override
    public void paint() {
        System.out.println("You have created MacOSButton");
    }
}
