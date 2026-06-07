public class BlankImage extends Image {
    private int width, height;

    public BlankImage(String name, int width, int height) {
        super(name, "blank canvas");
        this.width = width;
        this.height = height;
    }

    @Override
    public void display() {
        System.out.println("[Display] Blank canvas " + width + "x" + height + " - " + name);
    }

    @Override
    public void load() {
        System.out.println("[Load] Creating blank image " + width + "x" + height);
    }
}