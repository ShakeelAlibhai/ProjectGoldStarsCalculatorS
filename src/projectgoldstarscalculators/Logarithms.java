package projectgoldstarscalculators;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
public class Logarithms implements ActionListener
{
    public static JTextField numberField, logBase10Field, logBaseEField;
    
    public Logarithms()
    {
        squareAndCubeRoots();
    }
    
    private void squareAndCubeRoots()
    {
        ProgramWindow frame = new ProgramWindow("Logarithms");
        frame.setLayout(new GridLayout(3, 3));
        frame.setSize(750 * ProjectGoldStarsCalculatorS.multiplier, 400 * ProjectGoldStarsCalculatorS.multiplier);
        frame.setInstructionsMenuBar("Please enter a number, and then press Compute to find the Log Base 10 and Log Base e:");
        frame.add(Components.standardLabel("Number:"));
        setupNumberField();
        frame.add(numberField);
        frame.add(Components.button2("Compute", new ComputeListener()));
        frame.add(Components.standardLabel("Log Base 10:"));
        setupLogBase10Field();
        frame.add(logBase10Field);
        frame.add(new JLabel());
        frame.add(Components.standardLabel("Log Base e:"));
        setupLogBaseEField();
        frame.add(logBaseEField);
        frame.add(new JLabel());
        frame.makeVisible();
    }
    
    private void setupNumberField()
    {
        numberField = new JTextField("0");
        numberField.setFont(ProjectGoldStarsCalculatorS.bodyText2);
    }
    
    private void setupLogBase10Field()
    {
        logBase10Field = new JTextField("0");
        logBase10Field.setEditable(false);
        logBase10Field.setFont(ProjectGoldStarsCalculatorS.bodyText2);
    }
    
    private void setupLogBaseEField()
    {
        logBaseEField = new JTextField("0");
        logBaseEField.setEditable(false);
        logBaseEField.setFont(ProjectGoldStarsCalculatorS.bodyText2);
    }
    
    private class ComputeListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            String temp = numberField.getText();
            double input;
            //Attempt to convert the user's input from a String to a double.
            //If the conversion fails, display an error message and exit the method.
            try
            {
                input = Double.parseDouble(temp);
            }
            catch(Exception e2)
            {
                JOptionPane.showMessageDialog(null, "ERROR", "Calculator", JOptionPane.ERROR_MESSAGE);
                return;
            }
            logBase10Field.setText("" + Math.log10(input));
            logBaseEField.setText("" + Math.log(input));
        }
    }
    
    @Override
    public void actionPerformed(ActionEvent e)
    {
        throw new UnsupportedOperationException("Error");
    }
}