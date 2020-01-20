package projectgoldstarscalculators;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
public class SquareAndCubeRoots implements ActionListener
{
    public static JTextField numberField, squareRootField, cubeRootField;
    
    public SquareAndCubeRoots()
    {
        squareAndCubeRoots();
    }
    
    private void squareAndCubeRoots()
    {
        ProgramWindow frame = new ProgramWindow("Square & Cube Roots");
        frame.setLayout(new GridLayout(3, 3));
        frame.setSize(750 * Main.multiplier, 400 * Main.multiplier);
        frame.setInstructionsMenuBar("Please enter a number, and then press Compute to find its square and cube roots:");
        frame.add(Labels.standardLabel("Number:"));
        setupNumberField();
        frame.add(numberField);
        frame.add(Buttons.button2("Compute", new ComputeListener()));
        frame.add(Labels.standardLabel("Square Root:"));
        setupSquareRootField();
        frame.add(squareRootField);
        frame.add(new JLabel());
        frame.add(Labels.standardLabel("Cube Root:"));
        setupCubeRootField();
        frame.add(cubeRootField);
        frame.add(Labels.disclaimerLabel("Note: Values may not be exact."));
        frame.makeVisible();
    }
    
    private void setupNumberField()
    {
        numberField = new JTextField("0");
        numberField.setFont(Main.bodyText2);
        numberField.addActionListener(new ComputeListener());
    }
    
    private void setupSquareRootField()
    {
        squareRootField = new JTextField("0");
        squareRootField.setEditable(false);
        squareRootField.setFont(Main.bodyText2);
    }
    
    private void setupCubeRootField()
    {
        cubeRootField = new JTextField("0");
        cubeRootField.setEditable(false);
        cubeRootField.setFont(Main.bodyText2);
    }
    
    private class ComputeListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            double input;
            try
            {
                String temp = numberField.getText();
                input = Double.parseDouble(temp);
            }
            catch(Exception e2)
            {
                JOptionPane.showMessageDialog(null, "ERROR", "Calculator", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if(input >= 0)
            {
                squareRootField.setText("" + Math.sqrt(input));
            }
            else if(input == -1)
            {
                String output = "Imaginary Number: i";
                squareRootField.setText(output);
            }
            else    //If the input is a negative number other than -1
            {
                DecimalFormat df = new DecimalFormat("#.#####");    //Only print out a maximum of five decimal places
                String output = "Imaginary Number: " + df.format(Math.sqrt(input * -1)) + "i";
                squareRootField.setText(output);
            }
            cubeRootField.setText("" + Math.cbrt(input));
        }
    }
    
    @Override
    public void actionPerformed(ActionEvent e)
    {
        throw new UnsupportedOperationException("Error");
    }
}