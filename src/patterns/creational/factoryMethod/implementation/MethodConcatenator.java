package patterns.creational.factoryMethod.implementation;

public class MethodConcatenator extends Concatenator {
   protected StringConcat createConcatenator() {
        return new ViaMethod(); 
   }
}
