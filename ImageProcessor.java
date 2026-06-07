public abstract class ImageProcessor {
    protected CompressionStrategy compressionStrategy;

    public ImageProcessor(CompressionStrategy strategy) {
        this.compressionStrategy = strategy;
    }

    // Template method: defines the processing pipeline
    public final void processImage(Image image) {
        loadImage(image);
        applyFilters(image);
        compressImage(image);
        saveImage(image);
    }

    protected void loadImage(Image image) {
        image.load();
    }

    // Primitive method – subclasses can decide which filters to apply
    protected abstract void applyFilters(Image image);

    protected void compressImage(Image image) {
        compressionStrategy.compress(image);
    }

    protected void saveImage(Image image) {
        System.out.println("[Save] Saving image: " + image.getName());
    }
}