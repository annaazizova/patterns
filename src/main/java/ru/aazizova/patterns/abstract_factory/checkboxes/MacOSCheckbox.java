package ru.aazizova.patterns.abstract_factory.checkboxes;

/**
 * Created by aazizova on 09.10.2018.
 *
 * Все семейства продуктов имеют одинаковые вариации (MacOS/Windows).
 *
 * Вариация чекбокса под MacOS.
 */
public class MacOSCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("You have created MacOSCheckbox.");
    }
}
