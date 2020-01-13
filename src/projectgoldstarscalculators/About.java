package projectgoldstarscalculators;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
public class About
{
    public About()
    {
        about();
    }
    
    private void about()
    {
        JFrame frame = new JFrame("About");
        frame.setSize(750 * Main.multiplier, 400 * Main.multiplier);
        frame.setIconImage(Icon.getImage());
        frame.setLayout(new GridLayout(2, 1));
        frame.getContentPane().setBackground(Main.mainColor);
        frame.getContentPane().add(titleLabel());
        frame.getContentPane().add(versionLabel());
        frame.setVisible(true);
    }
    
    private JLabel titleLabel()
    {
        JLabel titleLabel = new JLabel(Main.NAME, SwingConstants.CENTER);
        titleLabel.setFont(Main.largeHeader);
        titleLabel.setForeground(Main.secondaryColor);
        return titleLabel;
    }
    
    private JLabel versionLabel()
    {
        JLabel versionLabel = new JLabel(Main.VERSION, SwingConstants.CENTER);
        versionLabel.setFont(Main.mediumText1);
        versionLabel.setForeground(Main.secondaryColor);
        return versionLabel;
    }
}