package projectgoldstarscalculators;
import components.ProgramWindow;
import components.Buttons;
import components.Labels;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
public class MilesPerGallonCalculator
{
    private static JTextField beginningField, endingField, gallonsField;
    
    public MilesPerGallonCalculator()
    {
        milesPerGallonCalculator();
    }
    
    private void milesPerGallonCalculator()
    {
        ProgramWindow frame = new ProgramWindow("Miles Per Gallon Calculator");
        frame.setLayout(new GridLayout(4, 2));
        frame.setSize(750 * Main.multiplier, 400 * Main.multiplier);
        frame.setInstructionsMenuBar("Please enter the following information, and then press Calculate to find the results:");
        frame.add(Labels.standardLabel("Beginning Odometer Reading:"));
        setupBeginningField();
        frame.add(beginningField);
        frame.add(Labels.standardLabel("Ending Odometer Reading:"));
        setupEndingField();
        frame.add(endingField);
        frame.add(Labels.standardLabel("Gallons of Gas Used:"));
        setupGallonsField();
        frame.add(gallonsField);
        frame.add(new JLabel());
        frame.add(Buttons.button2("Calculate", new CalculateMilesPerGallonListener()));
        frame.makeVisible();
    }
    
    private void setupBeginningField()
    {
        beginningField = new JTextField("0");
        beginningField.setFont(Main.bodyText2);
    }
    
    private void setupEndingField()
    {
        endingField = new JTextField("0");
        endingField.setFont(Main.bodyText2);
    }
    
    private void setupGallonsField()
    {
        gallonsField = new JTextField("0");
        gallonsField.setFont(Main.bodyText2);
    }
    
    public static class CalculateMilesPerGallonListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            String output;
            //Get the values of beginningField, endingField, and gallonsField and store them in Strings mpg1, mpg2, and mpg3, respectively.
            String mpgs1 = beginningField.getText();
            String mpgs2 = endingField.getText();
            String mpgs3 = gallonsField.getText();
            //Attempt to convert mpg1, mpg2, and mpg3 and store them in input1, input2, and input3, respectively.
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