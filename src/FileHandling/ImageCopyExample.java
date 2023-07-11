package FileHandling;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ImageCopyExample {
    public static void main(String[] args) {
        String sourceImagePath = "C:\\Users\\guddu\\Downloads\\myFlutterProject-1\\flutter.jpg";
        String destinationImagePath = "C:\\Users\\guddu\\OneDrive\\Desktop\\image.jpg";

        try {
            // Read the source image
            File sourceImageFile = new File(sourceImagePath);
            BufferedImage sourceImage = ImageIO.read(sourceImageFile);

            // Create a new BufferedImage with the same dimensions as the source image
            BufferedImage destinationImage = new BufferedImage(sourceImage.getWidth(), sourceImage.getHeight(),
                    sourceImage.getType());

            // Copy the pixels from the source image to the destination image
            for (int y = 0; y < sourceImage.getHeight(); y++) {
                for (int x = 0; x < sourceImage.getWidth(); x++) {
                    int rgb = sourceImage.getRGB(x, y);
                    destinationImage.setRGB(x, y, rgb);
                }
            }

            // Write the destination image to a file
            File destinationImageFile = new File(destinationImagePath);
            ImageIO.write(destinationImage, "jpg", destinationImageFile);

            System.out.println("Image copied successfully!");
        } catch (IOException e) {
            System.out.println("An error occurred while copying the image: " + e.getMessage());
        }
    }
}
