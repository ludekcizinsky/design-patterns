package patterns.behavioral.observer;

import patterns.behavioral.observer.implementation.Accumulator;
import patterns.behavioral.observer.implementation.Logger;

public class SimpleExample {
   public static void main(String[] args) {
        Accumulator accumulator = new Accumulator();
        Logger logger = new Logger();
        
        accumulator.addObserver(logger);
        accumulator.add(6);
   }  
}
