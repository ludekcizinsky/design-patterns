package patterns.structural.adapter;

import patterns.structural.adapter.implementation.Number;

public class SimpleExample {
   public static void main(String[] args) { 
    // Define a Number Object
    Number num = new Number(3);

    // Add a String
    String str = new String("6");
    num.add(str);

    // Show value, expected: 9
    System.out.println(num.getValue());
   } 
}
