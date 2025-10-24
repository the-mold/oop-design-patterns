import java.util.ArrayList;
import java.util.List;

// 1. Component Interface
interface FileSystemComponent {
    String getName();
    int getSize();
}

// 2. Leaf Class
class File implements FileSystemComponent {
    private String name;
    private int size;

    public File(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
        return size;
    }
}

// 3. Composite Class
class Directory implements FileSystemComponent {
    private String name;
    private List<FileSystemComponent> children = new ArrayList<>();

    public Directory(String name) {
        this.name = name;
    }

    public void addComponent(FileSystemComponent component) {
        children.add(component);
    }

    public void removeComponent(FileSystemComponent component) {
        children.remove(component);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
        int totalSize = 0;
        for (FileSystemComponent component : children) {
            totalSize += component.getSize();
        }
        return totalSize;
    }
}

// Client Code
public class CompositePatternDemo {
    public static void main(String[] args) {
        // Create files (leaves)
        File file1 = new File("document.txt", 100);
        File file2 = new File("image.jpg", 250);
        File file3 = new File("archive.zip", 500);

        // Create a directory (composite)
        Directory subFolder = new Directory("SubFolder");
        subFolder.addComponent(file3);

        // Create the root directory and add all components
        Directory rootFolder = new Directory("Root");
        rootFolder.addComponent(file1);
        rootFolder.addComponent(file2);
        rootFolder.addComponent(subFolder);

        // The client treats all components uniformly
        System.out.println("Size of " + file1.getName() + ": " + file1.getSize() + " KB");
        System.out.println("Total size of " + rootFolder.getName() + ": " + rootFolder.getSize() + " KB");
        System.out.println("Total size of " + subFolder.getName() + ": " + subFolder.getSize() + " KB");
    }
}