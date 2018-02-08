package projectgoldstarscalculators;
import java.awt.Color;
import java.awt.Font;
import java.io.File;
public class ProjectGoldStarsCalculatorS
{
    public static final String name = "Project GoldStars Calculator S 2.2 Update 1";
    public static final String version = "Version 2.2.1";
    public static final File projectGoldStarsCalculatorSFolder = new File(System.getProperty("user.home"), "Project GoldStars Calculator S");
    public static Color color1;
    public static Color color2;
    public static boolean standardColors;
    public static int height;
    public static int width;
    public static int multiplier;
    public static String theme;
    
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