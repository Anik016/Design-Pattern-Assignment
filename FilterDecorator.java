public abstract class FilterDecorator extends Image {
    protected Image wrappedImage;

    public FilterDecorator(Image image, String filterName) {
        super(image.getName() + " + " + filterName, image.getSourceType());
        this.wrappedImage = image;
    }

    @Override
    public void load() {
        wrappedImage.load(); // delegate loading to the wrapped image
    }

    @Override
    public abstract String getDescription();
}