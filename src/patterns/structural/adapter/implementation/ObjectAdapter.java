package patterns.structural.adapter.implementation;

/*
 * Adapter which uses the object stategy.
 * Useful when the external library has several classes
 * which you have to use.
 */
public class ObjectAdapter implements IAdder {
     
     // object of the external library
     private LibAdder adder; 

     public ObjectAdapter() {
         adder = new LibAdder(); 
     }

     @Override
     public int add(int a, String b) {
          int bInt = parseInt(b);
          int result = adder.add(a, bInt);
          return result;
     }
   
     public int parseInt(String str) {
          return Integer.parseInt(str);
     }
}
