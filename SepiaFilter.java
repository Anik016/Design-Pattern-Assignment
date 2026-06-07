public class SepiaFilter extends FilterDecorator {
    public SepiaFilter(Image image) {
        super(image, "Sepia");
    }

    @Override
    public void display() {
        wrappedImage.display();
        System.out.println("[Filter] Applying sepia tone");
    }

    @Override
    public String getDescription() {
        return wrappedImage.getDescription() + " + Sepia";
    }
}