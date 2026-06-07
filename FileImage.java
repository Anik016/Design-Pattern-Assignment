public class FileImage extends Image {
    public FileImage(String filename) {
        super(filename, "file");
    }

    @Override
    public void display() {
        System.out.println("[Display] Showing file image: " + name);
    }

    @Override
    public void load() {
        System.out.println("[Load] Loading image from file: " + name);
    }
}