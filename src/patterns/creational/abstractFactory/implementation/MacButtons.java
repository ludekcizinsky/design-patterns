package patterns.creational.abstractFactory.implementation;

public class MacButtons extends Buttons {
   @Override
   public void press(String button) {
        System.out.print("Pressed " + button + " on mac.");
   } 
}
