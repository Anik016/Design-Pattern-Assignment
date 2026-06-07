public class BlurFilter extends FilterDecorator {
    public BlurFilter(Image image) {
        super(image, "Blur");
    }

    @Override
    public void display() {
        wrappedImage.display();
        System.out.println("[Filter] Applying blur effect");
    }

    @Override
    public String getDescription() {
        return wrappedImage.getDescription() + " + Blur";
    }
}