package projectgoldstarscalculators;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
public class Icon
{
    public static Image getImage()
    {
        URL url = ProjectGoldStarsCalculatorS.class.getResource("/images/ProjectGoldStarsCalculatorSIcon.png");
        Image image = Toolkit.getDefaultToolkit().getImage(url);
        return image;
    }
}