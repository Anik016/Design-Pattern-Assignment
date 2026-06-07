public class NoCompression implements CompressionStrategy {
    @Override
    public void compress(Image image) {
        System.out.println("[NoCompression] Skipping compression");
    }
}