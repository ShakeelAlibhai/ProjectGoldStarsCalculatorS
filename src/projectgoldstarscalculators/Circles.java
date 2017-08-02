package projectgoldstarscalculators;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
public class Circles
{
    public static JTextField radius;
    
    public Circles()
    {
        circles();
    }
    
    private void circles()
    {
        ProgramWindow frame = new ProgramWindow("Circles");
        frame.setLayout(new GridLayout(3, 2));
        frame.setSize(750 * ProjectGoldStarsCalculatorS.multiplier, 400 * ProjectGoldStarsCalculatorS.multiplier);
        frame.add(instructionsLabel());
        frame.add(new JLabel());
        frame.add(aLabel());
        setupMPG1();
        frame.add(radius);
        frame.add(new JLabel());
        frame.add(Components.button2("Calculate", new CalculateListener()));
        frame.makeVisible();
    }
    
    private JLabel instructionsLabel()
    {
        JLabel instructionsLabel = new JLabel("Please enter the following information:");
        instructionsLabel.setFont(ProjectGoldStarsCalculatorS.mediumText1);
        instructionsLabel.setForeground(ProjectGoldStarsCalculatorS.color2);
        return instructionsLabel;
    }
    
    private JLabel aLabel()
    {
        JLabel aLabel = new JLabel("Radius:");
        aLabel.setForeground(ProjectGoldStarsCalculatorS.color2);
        aLabel.setFont(ProjectGoldStarsCalculatorS.bodyText1);
        return aLabel;
    }
    
    private void setupMPG1()
    {
        radius = new JTextField("0");
        radius.setFont(ProjectGoldStarsCalculatorS.bodyText2);
    }
    
    public static class CalculateListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            String output;
            String radiusStr = radius.getText();
            double radiusD;
            try
            {
                radiusD = Double.parseDouble(radiusStr);
            }
            catch(Exception e2)
            {
                JOptionPane.showMessageDialog(null, "ERROR", "Circles", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if(radiusD <= 0)
            {
                output = "ERROR:\n"
                        + "The radius of the circle is less than or equal to 0.";
                JOptionPane.showMessageDialog(null, output, "Circles", JOptionPane.ERROR_MESSAGE);
                return;
            }
            //Calculate the area.
            double area = Math.PI * radiusD * radiusD;
            //Calculate the circumference.
            double circumference = 2 * Math.PI * radiusD;
            //Display the area and circumference.
            output = "Area of the Circle: " + area + "\n"
                    + "Circumference of the Circle: " + circumference;
            JOptionPane.showMessageDialog(null, output, "Circles", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}