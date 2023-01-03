package patterns.structural.composite.implementation;

import java.util.List;
import java.util.ArrayList;

/*
 * This is the Composite node.
 */
public class Directory extends Entry {

    private double size;
    private List<Entry> entries;

    public Directory(String name) {
        super(name);
        entries = new ArrayList<>();
        size = 0;
    }

    public void addEntry(Entry entry) {
        entries.add(entry);
        size += entry.getSize();
    }

    public void removeEntry(Entry entry) {
        entries.remove(entry);
        size -= entry.getSize();
    }
   
    @Override
    public double getSize() {
        return size;
    }
}
