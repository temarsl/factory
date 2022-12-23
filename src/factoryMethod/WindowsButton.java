package factoryMethod;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WindowsButton implements Button {

    @Override
    public void render() {
        System.out.println("Windows button render!");
        onClick();
    }

    @Override
    public void onClick() {
        System.out.println("Windows button click!");
    }
}
