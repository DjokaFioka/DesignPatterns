package org.example.creational.abstract_factory.guru;

// The application picks the factory type depending on the
// current configuration or environment settings and creates it
// at runtime (usually at the initialization stage).
public class AbstractFactoryMain {

    public static void main(String[] args) {
        GuiFactory factory;

        var os = System.getProperty("os.name");
        System.out.println(os);
        if (os.equals("Windows 10") || os.equals("Windows 11")) {
            factory = new WinFactory();
        } else if (os.contains("mac")) {
            factory = new MacFactory();
        } else {
            System.out.println("Error! Unknown operating system.");
            return;
        }

        Application app = new Application(factory);
        app.createUI();
    }
}
