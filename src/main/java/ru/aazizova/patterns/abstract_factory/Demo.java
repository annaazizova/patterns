package ru.aazizova.patterns.abstract_factory;

import ru.aazizova.patterns.abstract_factory.factories.GUIFactory;
import ru.aazizova.patterns.abstract_factory.factories.MacOSFactory;
import ru.aazizova.patterns.abstract_factory.factories.WindowsFactory;

/**
 * Created by aazizova on 09.10.2018.
 *
 * Демо-класс. Здесь всё сводится воедино.
 */
public class Demo {
    /**
     * Приложение выбирает тип и создаёт конкретные фабрики динамически исходя
     * из конфигурации или окружения.
     */
    private static Application configureApplication(){
        Application app;
        GUIFactory factory;
        String osName = System.getProperty("os.name").toLowerCase();
        if(osName.contains("mac")){
            factory = new MacOSFactory();
            app = new Application(factory);
        } else {
            factory = new WindowsFactory();
            app = new Application(factory);
        }
        return app;
    }

    public static void main(String[] args) {
        Application app = configureApplication();
        app.paint();
    }
}
