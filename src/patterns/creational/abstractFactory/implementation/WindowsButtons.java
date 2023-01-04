package patterns.creational.abstractFactory.implementation;

public class WindowsButtons extends Buttons {
   @Override
   public void press(String button) {
        System.out.print("Pressed " + button + " on windows.");
   } 
}
