package patterns.structural.composite;
import patterns.structural.composite.implementation.Directory;
import patterns.structural.composite.implementation.File;
import patterns.structural.composite.implementation.Extensions;

public class SimpleExample {
   public static void main(String[] args) {

    // Define entries
    Directory root = new Directory("root dir");
    File file1 = new File(10, "file1.csv", Extensions.CSV);
    File file2 = new File(20, "file2.py", Extensions.PY);

    // Compose them together
    root.addEntry(file1);
    root.addEntry(file2);

    // Show size of the root directory
    System.out.printf("Size of the root directory is %f", root.getSize());

   } 
}
