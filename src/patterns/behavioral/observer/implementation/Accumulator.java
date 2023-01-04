package patterns.behavioral.observer.implementation;

import java.util.List;
import java.util.ArrayList;

/*
 * Subject of observation
 */
public class Accumulator {
   private int value;
   private List<Observer> observers;

   public Accumulator() {
        value = 0;
        observers = new ArrayList<>(); 
   }
   
   public void add(int val) {
        this.value += val;
        for (Observer obs : observers) {
            obs.onAdd(val);
        }
   }

   public int getValue() {
        return value;
   }

   public void addObserver(Observer obs) {
        observers.add(obs);
   }

   public void removeObserver(Observer obs) {
        observers.remove(obs);
   }
}
