package patterns.structural.adapter.implementation;

public class ClassAdapter extends LibAdder implements IAdder {
    
    @Override
    public int add(int a, String b) {
        int bInt = parseInt(b);
        int result = add(a, bInt);
        return result;
    }

    public int parseInt(String str) {
        return Integer.parseInt(str);
    }
}
