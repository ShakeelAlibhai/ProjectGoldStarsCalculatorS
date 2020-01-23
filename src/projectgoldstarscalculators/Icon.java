package projectgoldstarscalculators;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
public class Icon
{
    //Returns the Project GoldStars Calculator S icon as an Image
    public static Image getImage()
    {
        URL url = Main.class.getResource("/res/ProjectGoldStarsCalculatorSIcon.png");
        Image image = Toolkit.getDefaultToolkit().getImage(url);
        return image;
    }
}