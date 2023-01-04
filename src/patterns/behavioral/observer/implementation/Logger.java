package patterns.behavioral.observer.implementation;

public class Logger implements Observer {
   public void onAdd(int value) {
        System.out.printf("Accumulator just added: %d", value); 
   } 
}
