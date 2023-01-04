package patterns.behavioral.strategy.implementation;

public class ForItr extends Iteration {
       public void iterate(int[] iterable) {
        System.out.printf("%s", "For loop:");
        for (int i : iterable) {
            System.out.printf(" %d", i);
        }
   }
}
