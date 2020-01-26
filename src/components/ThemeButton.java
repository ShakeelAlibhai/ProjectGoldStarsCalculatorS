package components;
import java.awt.Color;
import java.awt.event.ActionListener;
import projectgoldstarscalculators.Main;
public class ThemeButton extends Button
{
    public ThemeButton(String text, ActionListener listener, Color background, Color foreground)
    {
        super(text, listener, background, foreground, Main.mediumText2);
    }
}