public abstract class Image {
    protected String name;
    protected String sourceType;

    public Image(String name, String sourceType) {
        this.name = name;
        this.sourceType = sourceType;
    }

    public String getName() {
        return name;
    }

    public String getSourceType() {
        return sourceType;
    }

    public String getDescription() {
        return name + " (from " + sourceType + ")";
    }

    // Simulates displaying the image (e.g., on screen)
    public abstract void display();

    // Simulates loading pixel data
    public abstract void load();
}