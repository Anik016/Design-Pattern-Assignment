public class PngCompression implements CompressionStrategy {
    @Override
    public void compress(Image image) {
        System.out.println("[PNG] Lossless compression applied to " + image.getName());
    }
}