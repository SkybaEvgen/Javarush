package Solution;

import Solution.Common.ImageReader;
import Solution.Common.ImageTypes;

public class Solution {
    public static void main(String[] args) throws IllegalAccessException {
        ImageReader reader = ImageReaderFactory.getImageReader(ImageTypes.JPG);
    }
}
