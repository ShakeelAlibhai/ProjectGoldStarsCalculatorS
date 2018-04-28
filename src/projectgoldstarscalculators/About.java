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
        frame.setSize(750 * ProjectGoldStarsCalculatorS.multiplier, 400 * ProjectGoldStarsCalculatorS.multiplier);
        frame.setIconImage(Icon.getImage());
        frame.setLayout(new GridLayout(2, 1));
        frame.getContentPane().setBackground(ProjectGoldStarsCalculatorS.color1);
        frame.getContentPane().add(titleLabel());
        frame.getContentPane().add(versionLabel());
        frame.setVisible(true);
    }
    
    private JLabel titleLabel()
    {
        JLabel titleLabel = new JLabel(ProjectGoldStarsCalculatorS.NAME, SwingConstants.CENTER);
        titleLabel.setFont(ProjectGoldStarsCalculatorS.largeHeader);
        titleLabel.setForeground(ProjectGoldStarsCalculatorS.color2);
        return titleLabel;
    }
    
    private JLabel versionLabel()
    {
        JLabel versionLabel = new JLabel(ProjectGoldStarsCalculatorS.VERSION, SwingConstants.CENTER);
        versionLabel.setFont(ProjectGoldStarsCalculatorS.mediumText1);
        versionLabel.setForeground(ProjectGoldStarsCalculatorS.color2);
        return versionLabel;
    }
}