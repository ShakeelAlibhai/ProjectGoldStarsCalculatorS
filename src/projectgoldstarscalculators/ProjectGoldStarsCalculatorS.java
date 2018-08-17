package projectgoldstarscalculators;
import java.awt.Color;
import java.awt.Font;
import java.io.File;
public class ProjectGoldStarsCalculatorS
{
    public static final String NAME = "Project GoldStars Calculator S 2.5";
    public static final String VERSION = "Version 2.5";
    public static final File FOLDER = new File(System.getProperty("user.home"), "Project GoldStars Calculator S");
    public static int height;
    public static int width;
    public static int multiplier;
    public static String theme;
    
    //Color Variables
    public static Color mainColor;
    public static Color secondaryColor;
    public static Color textBackgroundColor;
    public static boolean standardColors;
    
    //Fonts
    public static Font largeHeader;
    public static Font mediumHeader;
    public static Font mediumText1;
    public static Font mediumText2;
    public static Font mediumText3;
    public static Font bodyText1;
    public static Font bodyText2;

    //Font Sizes
    public static final int LARGE_HEADER_SIZE = 22;
    public static final int MEDIUM_HEADER_SIZE = 20;
    public static final int MEDIUM_TEXT_SIZE1 = 16;
    public static final int MEDIUM_TEXT_SIZE2 = 16;
    public static final int MEDIUM_TEXT_SIZE3 = 12;
    public static final int BODY_TEXT_SIZE1 = 14;
    public static final int BODY_TEXT_SIZE2 = 14;
    
    public static void main(String[] args)
    {
        new Start();
    }
}