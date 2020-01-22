package components;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import projectgoldstarscalculators.Icon;
import projectgoldstarscalculators.Main;
public class StandardWindow
{
    protected JFrame frame;
    
    public StandardWindow(String title)
    {
        frame = new JFrame(title);
        frame.setIconImage(Icon.getImage());
    }
    
    public void makeVisible()
    {
        frame.setVisible(true);
    }
    
    public void setJMenuBar(JMenuBar menuBar)
    {
        frame.setJMenuBar(menuBar);
    }
    
    public void setInstructionsMenuBar(String instructions)
    {
        frame.setJMenuBar(instructionsMenuBar(instructions));
    }
    
    public void setLayout(GridLayout g)
    {
        frame.setLayout(g);
    }
    
    public void setSize(int a, int b)
    {
        frame.setSize(a, b);
    }
    
    private JMenuBar instructionsMenuBar(String instructions)
    {
        JMenuBar menuBar = new JMenuBar();
        menuBar.setBackground(Main.mainColor);
        menuBar.add(instructionsLabel(instructions));
        return menuBar;
    }
    
    private JLabel instructionsLabel(String instructions)
    {
        JLabel instructionsLabel = new JLabel(instructions);
        instructionsLabel.setForeground(Main.secondaryColor);
        instructionsLabel.setFont(Main.mediumText1);
        return instructionsLabel;
    }
}