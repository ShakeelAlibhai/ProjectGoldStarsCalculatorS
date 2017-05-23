package projectgoldstarscalculators;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
public class Start
{
    public Start()
    {
        widthAndHeight();
        setFonts();
        new Window();
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
        ProjectGoldStarsCalculatorS.largeHeader = new java.awt.Font("Open Sans Extrabold", Font.PLAIN, ProjectGoldStarsCalculatorS.largeHeaderSize * ProjectGoldStarsCalculatorS.multiplier);
        ProjectGoldStarsCalculatorS.mediumHeader = new java.awt.Font("Open Sans Extrabold", Font.PLAIN, ProjectGoldStarsCalculatorS.mediumHeaderSize * ProjectGoldStarsCalculatorS.multiplier);
        ProjectGoldStarsCalculatorS.mediumText1 = new java.awt.Font("Open Sans Bold", Font.PLAIN, ProjectGoldStarsCalculatorS.mediumText1Size * ProjectGoldStarsCalculatorS.multiplier);
        ProjectGoldStarsCalculatorS.mediumText2 = new java.awt.Font("Open Sans Semibold", Font.PLAIN, ProjectGoldStarsCalculatorS.mediumText2Size * ProjectGoldStarsCalculatorS.multiplier);
        ProjectGoldStarsCalculatorS.mediumText3 = new java.awt.Font("Open Sans Bold", Font.PLAIN, ProjectGoldStarsCalculatorS.mediumText3Size * ProjectGoldStarsCalculatorS.multiplier);
        ProjectGoldStarsCalculatorS.bodyText1 = new java.awt.Font("Open Sans Semibold", Font.PLAIN, ProjectGoldStarsCalculatorS.bodyText1Size * ProjectGoldStarsCalculatorS.multiplier);
        ProjectGoldStarsCalculatorS.bodyText2 = new java.awt.Font("Open Sans", Font.PLAIN, ProjectGoldStarsCalculatorS.bodyText2Size * ProjectGoldStarsCalculatorS.multiplier);
    }
}