package components;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import projectgoldstarscalculators.Main;
public class Buttons
{
    public static JButton standardButton(String displayText, ActionListener actionListener)
    {
        JButton button = new JButton(displayText);
        button.setBackground(Main.secondaryColor);
        button.setForeground(Main.mainColor);
        button.setFont(Main.mediumText1);
        button.addActionListener(actionListener);
        return button;
    }
    
    public static JButton button2(String displayText, ActionListener actionListener)
    {
        JButton button = new JButton(displayText);
        button.setBackground(Main.secondaryColor);
        button.setForeground(Main.mainColor);
        button.setFont(Main.mediumText2);
        button.addActionListener(actionListener);
        return button;
    }
}