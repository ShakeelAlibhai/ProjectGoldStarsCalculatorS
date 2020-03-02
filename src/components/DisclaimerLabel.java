package components;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import projectgoldstarscalculators.Main;
public class DisclaimerLabel extends JLabel
{
    private JLabel label;
    
    public DisclaimerLabel(String displayText)
    {
        label = new JLabel(displayText, SwingConstants.CENTER);
        label.setForeground(Main.secondaryColor);
        label.setFont(Main.mediumText3);
    }
    
    JLabel getLabel()
    {
        return label;
    }
}
