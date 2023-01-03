package patterns.structural.adapter.implementation;

/*
 * Client that relies on the interface to add
 * String to number.
 * Note: Number depends on the IAdder instead of
 * the concrete implementation - e.g. ObjectAdapter.
 */
public class Number {
   private int val;
   private IAdder adder;
   
   public Number(int val) {
        this.val = val;
        // By default use ClassAdapter
        adder = new ClassAdapter();
   }

   /*
    * Method to be adapted.
    */
   public void add(String other) {
        val = adder.add(val, other);
   }

   public int getValue() {
        return val;
   }
}
