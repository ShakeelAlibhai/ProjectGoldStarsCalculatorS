package projectgoldstarscalculators;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
public class Labels
{    
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