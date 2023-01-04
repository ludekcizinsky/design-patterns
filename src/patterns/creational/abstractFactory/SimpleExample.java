package patterns.creational.abstractFactory;

import patterns.creational.abstractFactory.implementation.MacGui;
import patterns.creational.abstractFactory.implementation.Buttons;

public class SimpleExample {
    public static void main(String[] args) {
        MacGui gui = new MacGui();
        Buttons buttons = gui.createButtons();
        buttons.press("L");
    }
}
