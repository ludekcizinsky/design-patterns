package patterns.creational.factoryMethod.implementation;

public class ViaOperator extends StringConcat {
    
    @Override
    public String concat(String a, String b) {
        return a + b;
    } 
}
