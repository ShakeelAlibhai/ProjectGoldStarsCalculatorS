package projectgoldstarscalculators;
import components.ProgramWindow;
import components.ThemeButton;
import listeners.ThemeListeners;
import java.awt.Color;
import java.awt.GridLayout;
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
        frame.add(new ThemeButton("Dawn", new ThemeListeners.DawnThemeListener(), new Color(102, 0, 153), Color.yellow));
        frame.add(new ThemeButton("Dark", new ThemeListeners.DarkThemeListener(), Color.black, Color.lightGray));
        frame.add(new ThemeButton("Desert", new ThemeListeners.DesertThemeListener(), new Color(255, 228, 181), new Color(255, 69, 0)));
        frame.add(new ThemeButton("Fire", new ThemeListeners.FireThemeListener(), Color.red, Color.yellow));
        frame.add(new ThemeButton("Forest", new ThemeListeners.ForestThemeListener(), new Color(0x00, 0x80, 0x00), new Color(222, 184, 135)));
        frame.add(new ThemeButton("Grass", new ThemeListeners.GrassThemeListener(), Color.green, new Color(0x00, 0x80, 0x00)));
        frame.add(new ThemeButton("Mountain", new ThemeListeners.MountainThemeListener(), Color.darkGray, Color.white));
        frame.add(new ThemeButton("Silver", new ThemeListeners.SilverThemeListener(), Color.lightGray, Color.darkGray));
        frame.add(new ThemeButton("Sky", new ThemeListeners.SkyThemeListener(), Color.white, Color.blue));
        frame.add(new ThemeButton("Snow", new ThemeListeners.SnowThemeListener(), Color.white, Color.gray));
        frame.add(new ThemeButton("Water", new ThemeListeners.WaterThemeListener(), new Color(64, 224, 208), Color.blue));
        frame.add(new ThemeButton("Project GoldStars Calculator S (Default Theme)", new ThemeListeners.ProjectGoldStarsCalculatorSThemeListener(), Color.lightGray, new Color(0x00, 0x00, 0xC0)));
        frame.makeVisible();
    }
}