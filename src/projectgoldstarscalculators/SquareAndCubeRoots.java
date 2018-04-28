package projectgoldstarscalculators;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
        frame.setSize(750 * ProjectGoldStarsCalculatorS.multiplier, 400 * ProjectGoldStarsCalculatorS.multiplier);
        frame.setInstructionsMenuBar("Please enter a number, and then press Compute to find the square and cube roots:");
        frame.add(Components.standardLabel("Number:"));
        setupNumberField();
        frame.add(numberField);
        frame.add(Components.button2("Compute", new ComputeListener()));
        frame.add(Components.standardLabel("Square Root:"));
        setupSquareRootField();
        frame.add(squareRootField);
        frame.add(new JLabel());
        frame.add(Components.standardLabel("Cube Root:"));
        setupCubeRootField();
        frame.add(cubeRootField);
        frame.add(new JLabel());
        frame.makeVisible();
    }
    
    private void setupNumberField()
    {
        numberField = new JTextField("0");
        numberField.setFont(ProjectGoldStarsCalculatorS.bodyText2);
    }
    
    private void setupSquareRootField()
    {
        squareRootField = new JTextField("0");
        squareRootField.setEditable(false);
        squareRootField.setFont(ProjectGoldStarsCalculatorS.bodyText2);
    }
    
    private void setupCubeRootField()
    {
        cubeRootField = new JTextField("0");
        cubeRootField.setEditable(false);
        cubeRootField.setFont(ProjectGoldStarsCalculatorS.bodyText2);
    }
    
    private class ComputeListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            double input = 0.0;
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
            squareRootField.setText("" + Math.sqrt(input));
            cubeRootField.setText("" + Math.cbrt(input));
        }
    }
    
    @Override
    public void actionPerformed(ActionEvent e)
    {
        throw new UnsupportedOperationException("Error");
    }
}