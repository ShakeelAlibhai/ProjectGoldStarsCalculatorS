package projectgoldstarscalculators;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
public class CalcMilesPerGallon
{
    public static JTextField mpg1, mpg2, mpg3;
    
    public CalcMilesPerGallon()
    {
        calcMilesPerGallon();
    }
    
    private void calcMilesPerGallon()
    {
        JFrame qeFrame = new JFrame("Miles Per Gallon Calculator");
        qeFrame.getContentPane().setBackground(ProjectGoldStarsCalculatorS.color1);
        qeFrame.setLayout(new GridLayout(5, 2));
        qeFrame.setSize(750 * ProjectGoldStarsCalculatorS.multiplier, 400 * ProjectGoldStarsCalculatorS.multiplier);
        qeFrame.setIconImage(Icon.getImage());
        qeFrame.add(instructionsLabel());
        qeFrame.add(new JLabel());
        qeFrame.add(aLabel());
        setupMPG1();
        qeFrame.add(mpg1);
        qeFrame.add(bLabel());
        setupMPG2();
        qeFrame.add(mpg2);
        qeFrame.add(cLabel());
        setupMPG3();
        qeFrame.add(mpg3);
        qeFrame.add(new JLabel());
        qeFrame.add(Components.button2("Calculate", new CalculateMilesPerGallonListener()));
        qeFrame.setVisible(true);
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
        JLabel aLabel = new JLabel("Beginning Odometer Reading:");
        aLabel.setForeground(ProjectGoldStarsCalculatorS.color2);
        aLabel.setFont(ProjectGoldStarsCalculatorS.bodyText1);
        return aLabel;
    }
    
    private void setupMPG1()
    {
        mpg1 = new JTextField("0");
        mpg1.setFont(ProjectGoldStarsCalculatorS.bodyText2);
    }
    
    private JLabel bLabel()
    {
        JLabel bLabel = new JLabel("Ending Odometer Reading");
        bLabel.setForeground(ProjectGoldStarsCalculatorS.color2);
        bLabel.setFont(ProjectGoldStarsCalculatorS.bodyText1);
        return bLabel;
    }
    
    private void setupMPG2()
    {
        mpg2 = new JTextField("0");
        mpg2.setFont(ProjectGoldStarsCalculatorS.bodyText2);
    }
    
    private JLabel cLabel()
    {
        JLabel cLabel = new JLabel("Gallons of Gas Used:");
        cLabel.setForeground(ProjectGoldStarsCalculatorS.color2);
        cLabel.setFont(ProjectGoldStarsCalculatorS.bodyText1);
        return cLabel;
    }
    
    private void setupMPG3()
    {
        mpg3 = new JTextField("0");
        mpg3.setFont(ProjectGoldStarsCalculatorS.bodyText2);
    }
    
    public static class CalculateMilesPerGallonListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            String output;
            String mpgs1 = mpg1.getText();
            String mpgs2 = mpg2.getText();
            String mpgs3 = mpg3.getText();
            double input1, input2, input3;
            try
            {
                input1 = Double.parseDouble(mpgs1);
            }
            catch(Exception e2)
            {
                JOptionPane.showMessageDialog(null, "ERROR", "Miles Per Gallon Calculator", JOptionPane.ERROR_MESSAGE);
                return;
            }
            try
            {
                input2 = Double.parseDouble(mpgs2);
            }
            catch(Exception e2)
            {
                JOptionPane.showMessageDialog(null, "ERROR", "Miles Per Gallon Calculator", JOptionPane.ERROR_MESSAGE);
                return;
            }
            try
            {
                input3 = Double.parseDouble(mpgs3);
            }
            catch(Exception e2)
            {
                JOptionPane.showMessageDialog(null, "ERROR", "Miles Per Gallon Calculator", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if(input1 > input2)
            {
                output = "ERROR:\n"
                        + "The beginning odometer reading is larger than the ending odometer reading.";
                JOptionPane.showMessageDialog(null, output, "Miles Per Gallon Calculator", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if(input1 == input2)
            {
                output = "ERROR:\n"
                        + "The beginning odometer reading is the same as the ending odometer reading.";
                JOptionPane.showMessageDialog(null, output, "Miles Per Gallon Calculator", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if(input3 <= 0)
            {
                output = "ERROR:\n"
                        + "The number of gallons used is less than or equal to 0.";
                JOptionPane.showMessageDialog(null, output, "Miles Per Gallon Calculator", JOptionPane.ERROR_MESSAGE);
                return;
            }
            output = "The travel distance was " + (input2 - input1) + " miles.";
            output += "\nThe average miles per gallon was " + ((input2 - input1) / input3) + ".";
            JOptionPane.showMessageDialog(null, output, "Miles Per Gallon Calculator", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}