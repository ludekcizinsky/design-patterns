package patterns.creational.abstractFactory.implementation;

public class WindowsColors extends Colors {
    public String getColorOf(String button) {
        return "Color of the button " + button + "on windows is " + "blue."; 
    } 
}
