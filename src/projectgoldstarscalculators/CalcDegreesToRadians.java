package projectgoldstarscalculators;
import javax.swing.JOptionPane;
public class CalcDegreesToRadians
{
    public CalcDegreesToRadians()
    {
        degreesToRadians();
    }
    
    private void degreesToRadians()
    {
        String output;
        double firstNumber, secondNumber;
        output = JOptionPane.showInputDialog(null, "Please enter the number of degrees:", "Degrees to Radians", JOptionPane.QUESTION_MESSAGE);
        if(output == null)
        {
            return;
        }
        try
        {
            firstNumber = Double.parseDouble(output);
        }
        catch(Exception error)
        {
            return;
        }
        secondNumber = Math.toRadians(firstNumber);
        output = firstNumber + " Degrees ≈\n" + secondNumber + " Radians";
        JOptionPane.showMessageDialog(null, output, "Degrees to Radians", JOptionPane.INFORMATION_MESSAGE);
    }
}