package projectgoldstarscalculators;
import javax.swing.JOptionPane;
public class SquareRoot
{
    public SquareRoot()
    {
        squareRoot();
    }
    
    private void squareRoot()
    {
        String output;
        double sqrt;
        output = JOptionPane.showInputDialog(null, "Please enter the number to find the square root of: ", "Square Root", JOptionPane.QUESTION_MESSAGE);
        if(output == null)
        {
            return;
        }
        try
        {
            sqrt = Double.parseDouble(output);
        }
        catch(Exception error)
        {
            return;
        }
        if(sqrt < 0)
        {
            output = "ERROR:\n"
                    + "The square root of a negative number is not a real number.";
            JOptionPane.showMessageDialog(null, output, "Calculator", JOptionPane.ERROR_MESSAGE);
            return;
        }
        output = "The square root of " + sqrt + " is: " + Math.sqrt(sqrt);
        JOptionPane.showMessageDialog(null, output, "Square Root", JOptionPane.INFORMATION_MESSAGE);
    }
}