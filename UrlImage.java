public class UrlImage extends Image {
    private String url;

    public UrlImage(String url, String name) {
        super(name, "URL");
        this.url = url;
    }

    @Override
    public void display() {
        System.out.println("[Display] Streaming image from URL: " + url);
    }

    @Override
    public void load() {
        System.out.println("[Load] Downloading image from: " + url);
    }
}