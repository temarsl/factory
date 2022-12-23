package factoryMethod;

public abstract class Dialog {
    public void renderWindow() {
        Button okButton = createButton();
        okButton.render();
    }

    // чтобы каждый создавал свою
    public abstract Button createButton();
}