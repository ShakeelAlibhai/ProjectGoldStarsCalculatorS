package projectgoldstarscalculators;
import java.awt.Color;
import java.awt.Font;
public class ProjectGoldStarsCalculatorS
{
    public static final String name = "Project GoldStars Calculator S 1.0";
    public static final String version = "Version 1.0";
    public static Color color1 = Color.lightGray;
    public static Color color2 = new Color(0x00, 0x00, 0xC0);
    public static int height;
    public static int width;
    public static int multiplier;
    
    //Fonts
    public static Font largeHeader;
    public static Font mediumHeader;
    public static Font mediumText1;
    public static Font mediumText2;
    public static Font mediumText3;
    public static Font bodyText1;
    public static Font bodyText2;

    //Font Sizes
    public static final int largeHeaderSize = 22;
    public static final int mediumHeaderSize = 20;
    public static final int mediumText1Size = 16;
    public static final int mediumText2Size = 16;
    public static final int mediumText3Size = 12;
    public static final int bodyText1Size = 14;
    public static final int bodyText2Size = 14;
    
    public static void main(String[] args)
    {
        new Start();
    }
}