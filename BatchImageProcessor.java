public class BatchImageProcessor extends ImageProcessor {
    public BatchImageProcessor(CompressionStrategy strategy) {
        super(strategy);
    }

    @Override
    protected void applyFilters(Image image) {
        // In a real system, this would iterate over a list of filters.
        // For demo, we just print.
        System.out.println("[Filter] Applying all pre-configured filters (demo)");
        // Because decorators are already applied to the image,
        // we simply call display to simulate filter effects.
        image.display();
    }
}