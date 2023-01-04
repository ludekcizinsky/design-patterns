package patterns.behavioral.template;

import patterns.behavioral.template.implementation.GeneralGreeting;

public class SimpleExample {
   public static void main(String[] args) {
        GeneralGreeting greeting = new GeneralGreeting();
        greeting.greet("formal");
        greeting.greet("");
   } 
}
