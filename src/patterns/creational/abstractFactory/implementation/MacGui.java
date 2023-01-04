package patterns.creational.abstractFactory.implementation;

public class MacGui extends Gui {
    public Buttons createButtons() {
        return new MacButtons();
    }
    public Colors createColors() {
        return new MacColors();
    }   
}