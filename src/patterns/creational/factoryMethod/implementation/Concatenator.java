package patterns.creational.factoryMethod.implementation;

public abstract class Concatenator {
    public String concat(String a, String b) {
        StringConcat concatenator = createConcatenator();
        String result = concatenator.concat(a, b);
        return result;
    }
    
    protected abstract StringConcat createConcatenator();
}
