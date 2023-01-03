package patterns.creational.factoryMethod.implementation;

public class ViaMethod extends StringConcat {

    @Override
    public String concat(String a, String b) {
        return a.concat(b);
    } 
}
