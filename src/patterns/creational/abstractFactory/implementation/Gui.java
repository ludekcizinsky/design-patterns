package patterns.creational.abstractFactory.implementation;

/*
 * The Abstract factory  class
 */
public abstract class Gui {
   public abstract Buttons createButtons();
   public abstract Colors createColors();
}
