package patterns.creational.singleton;

import patterns.creational.singleton.implementation.Singleton;

public class SimpleExample {
   public static void main(String[] args) {
        // Initiate singleton object
        Singleton singleInstance = Singleton.getInstance();

        // Use the instance of the object
        singleInstance.greet();
   } 
}
