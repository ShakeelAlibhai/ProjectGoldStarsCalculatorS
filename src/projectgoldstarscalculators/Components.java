package projectgoldstarscalculators;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
public class Components
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
    
    public static JLabel standardLabel(String displayText)
    {
        JLabel label = new JLabel(displayText);
        label.setForeground(Main.secondaryColor);
        label.setFont(Main.bodyText1);
        return label;
    }
    
    public static JLabel disclaimerLabel(String displayText)
    {
        JLabel label = new JLabel(displayText, SwingConstants.CENTER);
        label.setForeground(Main.secondaryColor);
        label.setFont(Main.mediumText3);
        return label;
    }
}