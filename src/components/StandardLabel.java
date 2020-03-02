package components;
import javax.swing.JLabel;
import projectgoldstarscalculators.Main;
public class StandardLabel extends JLabel
{
    private JLabel label;
    
    public StandardLabel(String displayText)
    {
        label = new JLabel(displayText);
        label.setForeground(Main.secondaryColor);
        label.setFont(Main.bodyText1);
    }
    
    JLabel getLabel()
    {
        return label;
    }
}
