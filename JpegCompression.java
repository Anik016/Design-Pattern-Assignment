public class JpegCompression implements CompressionStrategy {
    private double quality;

    public JpegCompression(double quality) {
        this.quality = quality;
    }

    @Override
    public void compress(Image image) {
        System.out.printf("[JPEG] Compressing with quality %.2f%n", quality);
    }
}