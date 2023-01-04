package patterns.creational.factoryMethod;

import patterns.creational.factoryMethod.implementation.OperatorConcatenator;
import patterns.creational.factoryMethod.implementation.MethodConcatenator;
import patterns.creational.factoryMethod.implementation.Concatenator;

public class SimpleExample {

    public static void main(String[] args) { 
        // Construct the strings
        String s1 = new String("Hello ");
        String s2 = new String("world!");

        // Concat them using concat method of the String class
        Concatenator method = new MethodConcatenator();
        System.out.println(method.concat(s1, s2));

        // Concat them using concat method of the String class
        Concatenator operator = new OperatorConcatenator();
        System.out.println(operator.concat(s1, s2));
    } 
}
