package projectgoldstarscalculators;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
public class Start
{
    public Start()
    {
        createFolder();
        getTheme();
        applyTheme();
        widthAndHeight();
        setFonts();
        new Window();
    }
    
    private void createFolder()
    {
        //Make a Project GoldStars Calculator S folder if it does not exist yet.
        if(!Main.FOLDER.exists())
        {
            Main.FOLDER.mkdir();
        }
    }
    
    /*
     * Attempt to import the saved theme choice from the Project GoldStars Calculator S folder.
     * If nothing has been saved, Project GoldStars Calculator S will use the "Project GoldStars Calculator S" theme
     * and save this to the Project GoldStars Calculator S folder.
     */
    private static void getTheme()
    {
        File themeTemp = new File(Main.FOLDER, "theme.txt");
        try
        {
            Scanner s15 = new Scanner(themeTemp).useDelimiter("\\Z");
            Main.theme = s15.next();
            s15.close();
        }
        catch(FileNotFoundException e)
        {
            Main.theme = "Project GoldStars Calculator S";
            PrintWriter out;
            try
            {
                File file = new File(Main.FOLDER, "theme.txt");
                out = new PrintWriter(file);
                out.println(Main.theme);
                out.close();
            }
            catch(FileNotFoundException e2)
            {
                
            }
        }
    }
    
    public static void applyTheme()
    {
        Main.textBackgroundColor = Color.white;
        if("Dawn".equals(Main.theme))
        {
            Main.mainColor = new Color(102, 0, 153);
            Main.secondaryColor = Color.yellow;
            Main.standardColors = false;
        }
        if("Dark".equals(Main.theme))
        {
            Main.mainColor = Color.black;
            Main.secondaryColor = Color.lightGray;
            Main.textBackgroundColor = new Color(224, 224, 224);
            Main.standardColors = false;
        }
        if("Desert".equals(Main.theme))
        {
            Main.mainColor = new Color(255, 228, 181);
            Main.secondaryColor = new Color(255, 69, 0);
            Main.standardColors = true;
        }
        if("Fire".equals(Main.theme))
        {
            Main.mainColor = Color.red;
            Main.secondaryColor = Color.yellow;
            Main.standardColors = false;
        }
        if("Forest".equals(Main.theme))
        {
            Main.mainColor = new Color(0x00, 0x80, 0x00);
            Main.secondaryColor = new Color(222, 184, 135);
            Main.standardColors = false;
        }
        if("Grass".equals(Main.theme))
        {
            Main.mainColor = Color.green;
            Main.secondaryColor = new Color(0x00, 0x80, 0x00);
            Main.standardColors = true;
        }
        if("Mountain".equals(Main.theme))
        {
            Main.mainColor = Color.darkGray;
            Main.secondaryColor = Color.white;
            Main.standardColors = false;
        }
        if("Night".equals(Main.theme))
        {
            Main.mainColor = Color.black;
            Main.secondaryColor = Color.lightGray;
            Main.standardColors = false;
        }
        if("Silver".equals(Main.theme))
        {
            Main.mainColor = Color.lightGray;
            Main.secondaryColor = Color.darkGray;
            Main.standardColors = true;
        }
        if("Sky".equals(Main.theme))
        {
            Main.mainColor = Color.white;
            Main.secondaryColor = Color.blue;
            Main.standardColors = true;
        }
        if("Snow".equals(Main.theme))
        {
            Main.mainColor = Color.white;
            Main.secondaryColor = Color.gray;
            Main.standardColors = true;
        }
        if("Water".equals(Main.theme))
        {
            Main.mainColor = new Color(64, 224, 208);
            Main.secondaryColor = Color.blue;
            Main.standardColors = false;
        }
        if("Project GoldStars Calculator S".equals(Main.theme))
        {
            Main.mainColor = Color.lightGray;
            Main.secondaryColor = new Color(0x00, 0x00, 0xC0);
            Main.standardColors = true;
        }
    }
    
    private void widthAndHeight()
    {
        Toolkit t = Toolkit.getDefaultToolkit();
        Dimension screenResolution = t.getScreenSize();
        Main.width = screenResolution.width;
        Main.height = screenResolution.height;
        if(Main.width >= 3840 && Main.height >= 2160)
        {
            Main.multiplier = 3;
        }
        else if(Main.width > 1920 && Main.height > 1080)
        {
            Main.multiplier = 2;
        }
        else
        {
            Main.multiplier = 1;
        }
    }
    
    private void setFonts()
    {
        Main.largeHeader = new java.awt.Font("Open Sans Extrabold", Font.PLAIN, Main.LARGE_HEADER_SIZE * Main.multiplier);
        Main.mediumHeader = new java.awt.Font("Open Sans Extrabold", Font.PLAIN, Main.MEDIUM_HEADER_SIZE * Main.multiplier);
        Main.mediumText1 = new java.awt.Font("Open Sans Bold", Font.PLAIN, Main.MEDIUM_TEXT_SIZE1 * Main.multiplier);
        Main.mediumText2 = new java.awt.Font("Open Sans Semibold", Font.PLAIN, Main.MEDIUM_TEXT_SIZE2 * Main.multiplier);
        Main.mediumText3 = new java.awt.Font("Open Sans Bold", Font.PLAIN, Main.MEDIUM_TEXT_SIZE3 * Main.multiplier);
        Main.bodyText1 = new java.awt.Font("Open Sans Semibold", Font.PLAIN, Main.BODY_TEXT_SIZE1 * Main.multiplier);
        Main.bodyText2 = new java.awt.Font("Open Sans", Font.PLAIN, Main.BODY_TEXT_SIZE2 * Main.multiplier);
    }
}