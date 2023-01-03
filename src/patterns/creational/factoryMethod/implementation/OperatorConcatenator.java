package patterns.creational.factoryMethod.implementation;

public class OperatorConcatenator extends Concatenator {
    protected StringConcat createConcatenator() {
        return new ViaOperator();
    } 
}
