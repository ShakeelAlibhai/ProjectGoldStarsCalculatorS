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
        if(!ProjectGoldStarsCalculatorS.FOLDER.exists())
        {
            ProjectGoldStarsCalculatorS.FOLDER.mkdir();
        }
    }
    
    /*
     * Attempt to import the saved theme choice from the Project GoldStars Calculator S folder.
     * If nothing has been saved, Project GoldStars Calculator S will use the "Project GoldStars Calculator S" theme
     * and save this to the Project GoldStars Calculator S folder.
     */
    private static void getTheme()
    {
        File themeTemp = new File(ProjectGoldStarsCalculatorS.FOLDER, "theme.txt");
        try
        {
            Scanner s15 = new Scanner(themeTemp).useDelimiter("\\Z");
            ProjectGoldStarsCalculatorS.theme = s15.next();
            s15.close();
        }
        catch(FileNotFoundException e)
        {
            ProjectGoldStarsCalculatorS.theme = "Project GoldStars Calculator S";
            PrintWriter out;
            try
            {
                File file = new File(ProjectGoldStarsCalculatorS.FOLDER, "theme.txt");
                out = new PrintWriter(file);
                out.println(ProjectGoldStarsCalculatorS.theme);
                out.close();
            }
            catch(FileNotFoundException e2)
            {
                
            }
        }
    }
    
    public static void applyTheme()
    {
        ProjectGoldStarsCalculatorS.textBackgroundColor = Color.white;
        if("Dawn".equals(ProjectGoldStarsCalculatorS.theme))
        {
            ProjectGoldStarsCalculatorS.mainColor = new Color(102, 0, 153);
            ProjectGoldStarsCalculatorS.secondaryColor = Color.yellow;
            ProjectGoldStarsCalculatorS.standardColors = false;
        }
        if("Dark".equals(ProjectGoldStarsCalculatorS.theme))
        {
            ProjectGoldStarsCalculatorS.mainColor = Color.black;
            ProjectGoldStarsCalculatorS.secondaryColor = Color.lightGray;
            ProjectGoldStarsCalculatorS.textBackgroundColor = new Color(224, 224, 224);
            ProjectGoldStarsCalculatorS.standardColors = false;
        }
        if("Desert".equals(ProjectGoldStarsCalculatorS.theme))
        {
            ProjectGoldStarsCalculatorS.mainColor = new Color(255, 228, 181);
            ProjectGoldStarsCalculatorS.secondaryColor = new Color(255, 69, 0);
            ProjectGoldStarsCalculatorS.standardColors = true;
        }
        if("Fire".equals(ProjectGoldStarsCalculatorS.theme))
        {
            ProjectGoldStarsCalculatorS.mainColor = Color.red;
            ProjectGoldStarsCalculatorS.secondaryColor = Color.yellow;
            ProjectGoldStarsCalculatorS.standardColors = false;
        }
        if("Forest".equals(ProjectGoldStarsCalculatorS.theme))
        {
            ProjectGoldStarsCalculatorS.mainColor = new Color(0x00, 0x80, 0x00);
            ProjectGoldStarsCalculatorS.secondaryColor = new Color(222, 184, 135);
            ProjectGoldStarsCalculatorS.standardColors = false;
        }
        if("Grass".equals(ProjectGoldStarsCalculatorS.theme))
        {
            ProjectGoldStarsCalculatorS.mainColor = Color.green;
            ProjectGoldStarsCalculatorS.secondaryColor = new Color(0x00, 0x80, 0x00);
            ProjectGoldStarsCalculatorS.standardColors = true;
        }
        if("Mountain".equals(ProjectGoldStarsCalculatorS.theme))
        {
            ProjectGoldStarsCalculatorS.mainColor = Color.darkGray;
            ProjectGoldStarsCalculatorS.secondaryColor = Color.white;
            ProjectGoldStarsCalculatorS.standardColors = false;
        }
        if("Night".equals(ProjectGoldStarsCalculatorS.theme))
        {
            ProjectGoldStarsCalculatorS.mainColor = Color.black;
            ProjectGoldStarsCalculatorS.secondaryColor = Color.lightGray;
            ProjectGoldStarsCalculatorS.standardColors = false;
        }
        if("Silver".equals(ProjectGoldStarsCalculatorS.theme))
        {
            ProjectGoldStarsCalculatorS.mainColor = Color.lightGray;
            ProjectGoldStarsCalculatorS.secondaryColor = Color.darkGray;
            ProjectGoldStarsCalculatorS.standardColors = true;
        }
        if("Sky".equals(ProjectGoldStarsCalculatorS.theme))
        {
            ProjectGoldStarsCalculatorS.mainColor = Color.white;
            ProjectGoldStarsCalculatorS.secondaryColor = Color.blue;
            ProjectGoldStarsCalculatorS.standardColors = true;
        }
        if("Snow".equals(ProjectGoldStarsCalculatorS.theme))
        {
            ProjectGoldStarsCalculatorS.mainColor = Color.white;
            ProjectGoldStarsCalculatorS.secondaryColor = Color.gray;
            ProjectGoldStarsCalculatorS.standardColors = true;
        }
        if("Water".equals(ProjectGoldStarsCalculatorS.theme))
        {
            ProjectGoldStarsCalculatorS.mainColor = new Color(64, 224, 208);
            ProjectGoldStarsCalculatorS.secondaryColor = Color.blue;
            ProjectGoldStarsCalculatorS.standardColors = false;
        }
        if("Project GoldStars Calculator S".equals(ProjectGoldStarsCalculatorS.theme))
        {
            ProjectGoldStarsCalculatorS.mainColor = Color.lightGray;
            ProjectGoldStarsCalculatorS.secondaryColor = new Color(0x00, 0x00, 0xC0);
            ProjectGoldStarsCalculatorS.standardColors = true;
        }
    }
    
    private void widthAndHeight()
    {
        Toolkit t = Toolkit.getDefaultToolkit();
        Dimension screenResolution = t.getScreenSize();
        ProjectGoldStarsCalculatorS.width = screenResolution.width;
        ProjectGoldStarsCalculatorS.height = screenResolution.height;
        if(ProjectGoldStarsCalculatorS.width >= 3840 && ProjectGoldStarsCalculatorS.height >= 2160)
        {
            ProjectGoldStarsCalculatorS.multiplier = 3;
        }
        else if(ProjectGoldStarsCalculatorS.width > 1920 && ProjectGoldStarsCalculatorS.height > 1080)
        {
            ProjectGoldStarsCalculatorS.multiplier = 2;
        }
        else
        {
            ProjectGoldStarsCalculatorS.multiplier = 1;
        }
    }
    
    private void setFonts()
    {
        ProjectGoldStarsCalculatorS.largeHeader = new java.awt.Font("Open Sans Extrabold", Font.PLAIN, ProjectGoldStarsCalculatorS.LARGE_HEADER_SIZE * ProjectGoldStarsCalculatorS.multiplier);
        ProjectGoldStarsCalculatorS.mediumHeader = new java.awt.Font("Open Sans Extrabold", Font.PLAIN, ProjectGoldStarsCalculatorS.MEDIUM_HEADER_SIZE * ProjectGoldStarsCalculatorS.multiplier);
        ProjectGoldStarsCalculatorS.mediumText1 = new java.awt.Font("Open Sans Bold", Font.PLAIN, ProjectGoldStarsCalculatorS.MEDIUM_TEXT_SIZE1 * ProjectGoldStarsCalculatorS.multiplier);
        ProjectGoldStarsCalculatorS.mediumText2 = new java.awt.Font("Open Sans Semibold", Font.PLAIN, ProjectGoldStarsCalculatorS.MEDIUM_TEXT_SIZE2 * ProjectGoldStarsCalculatorS.multiplier);
        ProjectGoldStarsCalculatorS.mediumText3 = new java.awt.Font("Open Sans Bold", Font.PLAIN, ProjectGoldStarsCalculatorS.MEDIUM_TEXT_SIZE3 * ProjectGoldStarsCalculatorS.multiplier);
        ProjectGoldStarsCalculatorS.bodyText1 = new java.awt.Font("Open Sans Semibold", Font.PLAIN, ProjectGoldStarsCalculatorS.BODY_TEXT_SIZE1 * ProjectGoldStarsCalculatorS.multiplier);
        ProjectGoldStarsCalculatorS.bodyText2 = new java.awt.Font("Open Sans", Font.PLAIN, ProjectGoldStarsCalculatorS.BODY_TEXT_SIZE2 * ProjectGoldStarsCalculatorS.multiplier);
    }
}