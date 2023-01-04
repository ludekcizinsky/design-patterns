package patterns.behavioral.strategy.implementation;

public class WhileItr extends Iteration {
   public void iterate(int[] iterable) {
        System.out.printf("%s", "While loop:");
        int n = iterable.length;
        int i = 0;
        while (i < n) {
            System.out.printf(" %d", i);
            i++;
        }
   } 
}
