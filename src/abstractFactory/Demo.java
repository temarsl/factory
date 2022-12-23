package abstractFactory;

public class Demo {

    private static Application configureApplication(String osName) {
        Application app;
        GUIFactory factory;
        if (osName.equals("mac")) {
            factory = new MacOSFactory();
        } else {
            factory = new WindowsFactory();
        }
        app = new Application(factory);
        return app;
    }

    public static void main(String[] args) {
        Application app = configureApplication("mac");
        app.paint();

        System.out.println();

        app = configureApplication("wind");
        app.paint();
    }
}