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
        JFrame aboutFrame = new JFrame("About Project GoldStars Calculator S");
        aboutFrame.setSize(750 * ProjectGoldStarsCalculatorS.multiplier, 375 * ProjectGoldStarsCalculatorS.multiplier);
        aboutFrame.setIconImage(Icon.getImage());
        aboutFrame.setLayout(new GridLayout(2, 1));
        aboutFrame.getContentPane().setBackground(ProjectGoldStarsCalculatorS.color1);
        aboutFrame.getContentPane().add(titleLabel());
        aboutFrame.getContentPane().add(versionLabel());
        aboutFrame.setVisible(true);
    }
    
    private JLabel titleLabel()
    {
        JLabel titleLabel = new JLabel(ProjectGoldStarsCalculatorS.name, SwingConstants.CENTER);
        titleLabel.setFont(ProjectGoldStarsCalculatorS.largeHeader);
        titleLabel.setForeground(ProjectGoldStarsCalculatorS.color2);
        return titleLabel;
    }
    
    private JLabel versionLabel()
    {
        JLabel versionLabel = new JLabel(ProjectGoldStarsCalculatorS.version, SwingConstants.CENTER);
        versionLabel.setFont(ProjectGoldStarsCalculatorS.mediumText1);
        versionLabel.setForeground(ProjectGoldStarsCalculatorS.color2);
        return versionLabel;
    }
}