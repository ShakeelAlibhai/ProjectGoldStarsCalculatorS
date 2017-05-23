package projectgoldstarscalculators;
import java.awt.event.ActionListener;
import javax.swing.JButton;
public class Components
{
    public static JButton standardButton(String displayText, ActionListener actionListener)
    {
        JButton button = new JButton(displayText);
        button.setBackground(ProjectGoldStarsCalculatorS.color2);
        button.setForeground(ProjectGoldStarsCalculatorS.color1);
        button.setFont(ProjectGoldStarsCalculatorS.mediumText1);
        button.addActionListener(actionListener);
        return button;
    }
    
    public static JButton button2(String displayText, ActionListener actionListener)
    {
        JButton button = new JButton(displayText);
        button.setBackground(ProjectGoldStarsCalculatorS.color2);
        button.setForeground(ProjectGoldStarsCalculatorS.color1);
        button.setFont(ProjectGoldStarsCalculatorS.mediumText2);
        button.addActionListener(actionListener);
        return button;
    }
}