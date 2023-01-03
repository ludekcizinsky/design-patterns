package patterns.structural.adapter.implementation;

/*
 * External library that is not compatible with the IAdder:
 * add(int a, String b) vs add(int a, int b)
 */
public class LibAdder {
   public int add(int a, int b) {
        return a + b;    
   } 
}
