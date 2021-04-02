import java.io.File;
import java.io.IOException;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.nio.Buffer;
import javax.imageio.ImageIO;




public class pixel_edit {

    public static void main(String args[]) throws IOException {

        int x = 10;
        int y = 19;

        int[] myList = new int[10];

        myList[0] = 69;

        System.out.println(myList[0]);

        //Reading the image
        File file = new File("c:/java_dir/testing/pixel_edit_test/images/wm_source.jpeg");
        BufferedImage img = ImageIO.read(file);
        BufferedImage sub_img;

        sub_img = img.getSubimage(
                10,
                10,
                100,
                20);


        int pixel = img.getRGB(x,y);

        //Creating a Color object from pixel value
        Color color = new Color(pixel, true);

        //Retrieving the R G B values
        int red = color.getRed();
        int green = color.getGreen();
        int blue = color.getBlue();
        int alpha = color.getAlpha();

        System.out.println(alpha);
        System.out.println(red);
        System.out.println(green);
        System.out.println(blue);

        red = 0;
        green = 0;
        blue = 0;

        //Creating new Color object
        color = new Color(red, green, blue);

        //Setting new Color object to the image
        img.setRGB(x, y, color.getRGB());
        img.setRGB(x+1, y, color.getRGB());
        img.setRGB(x+2, y, color.getRGB());
        img.setRGB(x+3, y, color.getRGB());
        img.setRGB(x+4, y, color.getRGB());

        y = y + 1;
        img.setRGB(x, y, color.getRGB());
        img.setRGB(x+1, y, color.getRGB());
        img.setRGB(x+2, y, color.getRGB());
        img.setRGB(x+3, y, color.getRGB());
        img.setRGB(x+4, y, color.getRGB());

        y = y + 1;
        img.setRGB(x, y, color.getRGB());
        img.setRGB(x+1, y, color.getRGB());
        img.setRGB(x+2, y, color.getRGB());
        img.setRGB(x+3, y, color.getRGB());
        img.setRGB(x+4, y, color.getRGB());


        file = new File("c:/java_dir/testing/pixel_edit_test/images/wm_source_modified.jpeg");
        File file2 = new File("c:/java_dir/testing/pixel_edit_test/images/sub_image.jpeg");
        ImageIO.write(img, "jpeg", file);
        ImageIO.write(sub_img, "jpeg", file2);

        System.out.println("V2 Complete...");

    }
}