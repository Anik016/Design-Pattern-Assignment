public class GrayscaleFilter extends FilterDecorator {
    public GrayscaleFilter(Image image) {
        super(image, "Grayscale");
    }

    @Override
    public void display() {
        wrappedImage.display();
        System.out.println("[Filter] Applying grayscale effect");
    }

    @Override
    public String getDescription() {
        return wrappedImage.getDescription() + " + Grayscale";
    }
}