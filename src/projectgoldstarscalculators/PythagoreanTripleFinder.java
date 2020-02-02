package projectgoldstarscalculators;
import components.ProgramWindow;
import components.Buttons;
import components.Labels;
import components.ResultField;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
public class PythagoreanTripleFinder
{
    private static JTextField firstNumberField, secondNumberField;
    private static ResultField resultField;
    
    public PythagoreanTripleFinder()
    {
        pythagoreanTripleFinder();
    }
    
    private void pythagoreanTripleFinder()
    {
        ProgramWindow frame = new ProgramWindow("Pythagorean Triple Finder");
        frame.setLayout(new GridLayout(4, 2));
        frame.setSize(750 * Main.multiplier, 400 * Main.multiplier);
        frame.setInstructionsMenuBar("Please enter 2 numbers, and then press Calculate to find a Pythagorean Triple:");
        frame.add(Labels.standardLabel("First Number:"));
        setupFirstNumberField();
        frame.add(firstNumberField);
        frame.add(Labels.standardLabel("Second Number:"));
        setupSecondNumberField();
        frame.add(secondNumberField);
        frame.add(new JLabel());
        frame.add(Buttons.button2("Calculate", new CalculateRectangleInformationListener()));
        frame.add(Labels.standardLabel("Result:"));
        resultField = new ResultField();
        frame.add(resultField);
        frame.makeVisible();
    }
    
    private void setupFirstNumberField()
    {
        firstNumberField = new JTextField("0");
        firstNumberField.setFont(Main.bodyText2);
    }
    
    private void setupSecondNumberField()
    {
        secondNumberField = new JTextField("0");
        secondNumberField.setFont(Main.bodyText2);
    }
    
    public static class CalculateRectangleInformationListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            String output;
            int input1, input2;
            
            //Attempt to convert the first number from a String to an int.
            //If the conversion fails, display an error message and exit the method.
            try
            {
                input1 = Integer.parseInt(firstNumberField.getText());
            }
            catch(Exception e2)
            {
                JOptionPane.showMessageDialog(null, "ERROR", "Pythagorean Triple Finder", JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            //Attempt to convert the second number from a String to an int.
            //If the conversion fails, display an error message and exit the method.
            try
            {
                input2 = Integer.parseInt(secondNumberField.getText());
            }
            catch(Exception e2)
            {
                JOptionPane.showMessageDialog(null, "ERROR", "Pythagorean Triple Finder", JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            //If the first number is less than 1, display an error message and exit the method
            if(input1 < 1)
            {
                output = "ERROR:\n"
                        + "Number must be greater than or equal to 1.";
                JOptionPane.showMessageDialog(null, output, "Pythagorean Triple Finder", JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            //If the second number number is less than 1, display an error message and exit the method
            if(input2 < 1)
            {
                output = "ERROR:\n"
                        + "Number must be greater than or equal to 1.";
                JOptionPane.showMessageDialog(null, output, "Pythagorean Triple Finder", JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            //If the second number is larger than the first number, switch the first and second numbers
            if(input2 > input1)
            {
                int temp;
                temp = input1;
                input1 = input2;
                input2 = temp;
            }
            
            //Calculate and display the Pythagorean triple
            int a, b, c;
            a = (int)(Math.pow(input1, 2) - Math.pow(input2, 2));
            b = 2 * input1 * input2;
            c = (int)(Math.pow(input1, 2) + Math.pow(input2, 2));
            output = "a = " + a + ", b = " + b + ", c = " + c;
            resultField.updateText(output);
        }
    }
}