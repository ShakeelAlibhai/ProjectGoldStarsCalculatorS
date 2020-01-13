package projectgoldstarscalculators;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JButton;
public class Themes
{
    public Themes()
    {
        themes();
    }
    
    private void themes()
    {
        ProgramWindow frame = new ProgramWindow("Themes");
        frame.setLayout(new GridLayout(12, 1));
        frame.setSize(775 * Main.multiplier, 400 * Main.multiplier);
        frame.setInstructionsMenuBar("Please choose a theme:");
        frame.add(dawnTheme());
        frame.add(darkTheme());
        frame.add(desertTheme());
        frame.add(fireTheme());
        frame.add(forestTheme());
        frame.add(grassTheme());
        frame.add(mountainTheme());
        frame.add(silverTheme());
        frame.add(skyTheme());
        frame.add(snowTheme());
        frame.add(waterTheme());
        frame.add(projectGoldStarsCalculatorSTheme());
        frame.makeVisible();
    }
    
    private JButton dawnTheme()
    {
        JButton darkTheme = new JButton("Dawn");
        darkTheme.setFont(Main.mediumText2);
        darkTheme.setBackground(new Color(102, 0, 153));
        darkTheme.setForeground(Color.yellow);
        darkTheme.addActionListener(new ListenersThemes.DawnThemeListener());
        return darkTheme;
    }
    
    private JButton darkTheme()
    {
        JButton darkTheme = new JButton("Dark");
        darkTheme.setFont(Main.mediumText2);
        darkTheme.setBackground(Color.black);
        darkTheme.setForeground(Color.lightGray);
        darkTheme.addActionListener(new ListenersThemes.DarkThemeListener());
        return darkTheme;
    }
    
    private JButton desertTheme()
    {
        JButton darkTheme = new JButton("Desert");
        darkTheme.setFont(Main.mediumText2);
        darkTheme.setBackground(new Color(255, 228, 181));
        darkTheme.setForeground(new Color(255, 69, 0));
        darkTheme.addActionListener(new ListenersThemes.DesertThemeListener());
        return darkTheme;
    }
    
    private JButton fireTheme()
    {
        JButton fireTheme = new JButton("Fire");
        fireTheme.setFont(Main.mediumText2);
        fireTheme.setBackground(Color.red);
        fireTheme.setForeground(Color.yellow);
        fireTheme.addActionListener(new ListenersThemes.FireThemeListener());
        return fireTheme;
    }
    
    private JButton forestTheme()
    {
        JButton forestTheme = new JButton("Forest");
        forestTheme.setFont(Main.mediumText2);
        forestTheme.setBackground(new Color(0x00, 0x80, 0x00));
        forestTheme.setForeground(new Color(222, 184, 135));
        forestTheme.addActionListener(new ListenersThemes.ForestThemeListener());
        return forestTheme;
    }
    
    private JButton grassTheme()
    {
        JButton grassTheme = new JButton("Grass");
        grassTheme.setFont(Main.mediumText2);
        grassTheme.setBackground(Color.green);
        grassTheme.setForeground(new Color(0x00, 0x80, 0x00));
        grassTheme.addActionListener(new ListenersThemes.GrassThemeListener());
        return grassTheme;
    }
    
    private JButton mountainTheme()
    {
        JButton mountainTheme = new JButton("Mountain");
        mountainTheme.setFont(Main.mediumText2);
        mountainTheme.setBackground(Color.darkGray);
        mountainTheme.setForeground(Color.white);
        mountainTheme.addActionListener(new ListenersThemes.MountainThemeListener());
        return mountainTheme;
    }
    
    private JButton silverTheme()
    {
        JButton skyTheme = new JButton("Silver");
        skyTheme.setFont(Main.mediumText2);
        skyTheme.setBackground(Color.lightGray);
        skyTheme.setForeground(Color.darkGray);
        skyTheme.addActionListener(new ListenersThemes.SilverThemeListener());
        return skyTheme;
    }
    
    private JButton skyTheme()
    {
        JButton skyTheme = new JButton("Sky");
        skyTheme.setFont(Main.mediumText2);
        skyTheme.setBackground(Color.white);
        skyTheme.setForeground(Color.blue);
        skyTheme.addActionListener(new ListenersThemes.SkyThemeListener());
        return skyTheme;
    }
    
    private JButton snowTheme()
    {
        JButton snowTheme = new JButton("Snow");
        snowTheme.setFont(Main.mediumText2);
        snowTheme.setBackground(Color.white);
        snowTheme.setForeground(Color.gray);
        snowTheme.addActionListener(new ListenersThemes.SnowThemeListener());
        return snowTheme;
    }
    
    private JButton waterTheme()
    {
        JButton waterTheme = new JButton("Water");
        waterTheme.setFont(Main.mediumText2);
        waterTheme.setBackground(new Color(64, 224, 208));
        waterTheme.setForeground(Color.blue);
        waterTheme.addActionListener(new ListenersThemes.WaterThemeListener());
        return waterTheme;
    }
    
    private JButton projectGoldStarsCalculatorSTheme()
    {
        JButton projectGoldStarxCalculatorSTheme = new JButton("Project GoldStars Calculator S (Default Theme)");
        projectGoldStarxCalculatorSTheme.setFont(Main.mediumText2);
        projectGoldStarxCalculatorSTheme.setBackground(Color.lightGray);
        projectGoldStarxCalculatorSTheme.setForeground(new Color(0x00, 0x00, 0xC0));
        projectGoldStarxCalculatorSTheme.addActionListener(new ListenersThemes.ProjectGoldStarsCalculatorSThemeListener());
        return projectGoldStarxCalculatorSTheme;
    }
}