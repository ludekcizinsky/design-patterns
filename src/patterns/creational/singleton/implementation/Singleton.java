package patterns.creational.singleton.implementation;

public class Singleton {

    // If eager, then I would initialize the instance here;
    private static Singleton instance;
    private String greeting = "Hello there!";

    private Singleton() {}

    /*
     * Implementation of singleton with lazy instation
     */
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;    
    }
    
    public void greet() {
        System.out.println(greeting);
    } 
}
