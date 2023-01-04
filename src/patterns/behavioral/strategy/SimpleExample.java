package patterns.behavioral.strategy;

import patterns.behavioral.strategy.implementation.Iteration;
import patterns.behavioral.strategy.implementation.ForItr;
import patterns.behavioral.strategy.implementation.WhileItr;

public class SimpleExample {
   public static void main(String[] args) {

        // Define some example input data
        int[] iterable = {1, 2, 3, 4, 5, 6};
        String unknown = "for"; // This should be unknown at static

        // Choose strategy
        switch(unknown) {
            case "for":
                Iteration foritr = new ForItr();
                foritr.iterate(iterable);
                break;
            case "while":
                Iteration whileitr = new WhileItr();
                whileitr.iterate(iterable);
                break;
            default:
                Iteration dflt = new ForItr();
                dflt.iterate(iterable);           
        }
         
   } 
}
