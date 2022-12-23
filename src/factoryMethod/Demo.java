package factoryMethod;

public class Demo {
    private static Dialog dialog;

    public static void main(String[] args) {
        configure("WB");
        runBusinessLogic();

        System.out.println();

        configure("HB");
        runBusinessLogic();
    }

    static void configure(String s) {
        if (s.equals("WB")) {
            dialog = new WindowsDialog();
        } else if (s.equals("HB")){
            dialog = new HtmlDialog();
        } else {
            System.out.println("Sorry, such a button has not yet been created");
        }
    }

    static void runBusinessLogic() {
        dialog.renderWindow();
    }
}
