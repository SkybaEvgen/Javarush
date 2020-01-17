package Solution;

import Solution.Common.*;

public class ImageReaderFactory {
    public static ImageReader getImageReader(ImageTypes jpg) throws IllegalAccessException {
        ImageReader i = null;

        switch (jpg != null ? jpg : ImageTypes.UNDEFINED) {
            case BMP:
                i = new BmpReader();
                break;
            case JPG:
                i = new JpgReader();
                break;
            case PNG:
                i=new PngReader();
                break;
            default:
                throw new IllegalArgumentException("Неизвестный тип картинки");
        }
        return i;
    }
}
