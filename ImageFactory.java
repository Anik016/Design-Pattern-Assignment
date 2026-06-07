public class ImageFactory {
    public static Image createImage(String type, String... params) {
        if (type == null) throw new IllegalArgumentException("Image type cannot be null");
        switch (type.toLowerCase()) {
            case "file":
                if (params.length < 1) throw new IllegalArgumentException("Filename required");
                return new FileImage(params[0]);
            case "url":
                if (params.length < 2) throw new IllegalArgumentException("URL and name required");
                return new UrlImage(params[0], params[1]);
            case "blank":
                if (params.length < 3) throw new IllegalArgumentException("Name, width, height required");
                int w = Integer.parseInt(params[1]);
                int h = Integer.parseInt(params[2]);
                return new BlankImage(params[0], w, h);
            default:
                throw new IllegalArgumentException("Unknown image type: " + type);
        }
    }
}