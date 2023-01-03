package patterns.structural.composite.implementation;

/*
 * Represents the Leaf in the pattern
 * Notice: implementation of the common method
 */
public class File extends Entry {

    private Extensions extension;
    private double size;

    public File(double size, String name, Extensions extension) {
        super(name);
        this.size = size;
        this.extension = extension;
    }
   
    @Override
    public double getSize() {
      return size;  
    }

    public Extensions getExtension() {
        return extension;
    }
}
