public class Main {
    public static void main(String[] args) {
        System.out.println("--- Image Processing Demo ---");

        // 1. Factory creates a base image
        Image original = ImageFactory.createImage("file", "landscape.jpg");
        System.out.println("Original: " + original.getDescription());

        // 2. Decorator adds filters
        Image filtered = new GrayscaleFilter(original);
        filtered = new BlurFilter(filtered); // stacking decorators
        System.out.println("After filters: " + filtered.getDescription());

        // 3. Strategy: choose compression
        CompressionStrategy jpeg = new JpegCompression(0.75);

        // 4. Template Method: processor uses strategy and pipeline
        ImageProcessor processor = new BatchImageProcessor(jpeg);
        System.out.println("\nProcessing image using BatchImageProcessor with JPEG compression:");
        processor.processImage(filtered);

        // Another example: blank image with PNG compression and sepia filter
        System.out.println("\n--- Second Example ---");
        Image blank = ImageFactory.createImage("blank", "empty_canvas", "800", "600");
        Image sepiaBlank = new SepiaFilter(blank);
        CompressionStrategy png = new PngCompression();
        ImageProcessor proc2 = new BatchImageProcessor(png);
        proc2.processImage(sepiaBlank);
    }
}