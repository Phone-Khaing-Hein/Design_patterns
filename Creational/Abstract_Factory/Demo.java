package Creational.Abstract_Factory;

import Creational.Abstract_Factory.app.Application;
import Creational.Abstract_Factory.factories.GUIFactory;
import Creational.Abstract_Factory.factories.MacOSFactory;
import Creational.Abstract_Factory.factories.WindowsFactory;

public class Demo {
    
    private static Application configureApplication() {
        Application app;
        GUIFactory factory;
        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("mac")) {
            factory = new MacOSFactory();
        } else {
            factory = new WindowsFactory();
        }
        app = new Application(factory);
        return app;
    }

    public static void main(String[] args) {
        Application app = configureApplication();
        app.paint();
    }
}
