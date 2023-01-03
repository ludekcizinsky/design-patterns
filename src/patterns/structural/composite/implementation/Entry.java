package patterns.structural.composite.implementation;

/*
 * Represents the Component in the architecture.
 * Common method: getSize()
 */
public abstract class Entry {
    protected String name;

    public Entry(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract double getSize();
}