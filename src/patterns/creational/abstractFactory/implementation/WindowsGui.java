package patterns.creational.abstractFactory.implementation;

public class WindowsGui extends Gui {
   public Buttons createButtons() {
        return new WindowsButtons();
   }
   public Colors createColors() {
        return new MacColors();
   }
}
