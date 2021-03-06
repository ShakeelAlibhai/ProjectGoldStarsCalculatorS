package listeners;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;
import projectgoldstarscalculators.Main;
public class ThemeListeners
{
    public static class DawnThemeListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            processThemeChoice("Dawn");
        }
    }
    
    public static class DarkThemeListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            processThemeChoice("Dark");
        }
    }
    
    public static class DesertThemeListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            processThemeChoice("Desert");
        }
    }
    
    public static class FireThemeListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            processThemeChoice("Fire");
        }
    }
    
    public static class ForestThemeListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            processThemeChoice("Forest");
        }
    }
    
    public static class GrassThemeListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            processThemeChoice("Grass");
        }
    }

    public static class MountainThemeListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            processThemeChoice("Mountain");
        }
    }
    
    public static class SilverThemeListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            processThemeChoice("Silver");
        }
    }
    
    public static class SkyThemeListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            processThemeChoice("Sky");
        }
    }
    
    public static class SnowThemeListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            processThemeChoice("Snow");
        }
    }
    
    public static class WaterThemeListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            processThemeChoice("Water");
        }
    }
    
    public static class ProjectGoldStarsCalculatorSThemeListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            processThemeChoice("Project GoldStars Calculator S");
        }
    }
    
    private static void processThemeChoice(String themeName)
    {
        Main.theme = themeName;
        //Save the theme to the user's Project GoldStars Calculator S folder.
        PrintWriter out;
        try
        {
            File file = new File(Main.FOLDER, "theme.txt");
            out = new PrintWriter(file);
            out.append(Main.theme);
            out.close();
        }
        catch(FileNotFoundException e2)
        {

        }
        String output = "Choice saved.\n"
                + "You can restart Project GoldStars Calculator S to apply the theme now or later.";
        JOptionPane.showMessageDialog(null, output, "Change Theme", JOptionPane.INFORMATION_MESSAGE);
    }
}