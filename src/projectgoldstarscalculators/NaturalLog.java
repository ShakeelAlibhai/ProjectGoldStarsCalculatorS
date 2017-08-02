package projectgoldstarscalculators;
import javax.swing.JOptionPane;
public class NaturalLog
{
    public NaturalLog()
    {
        naturalLog();
    }
    
    private void naturalLog()
    {
        String output;
        double firstNumber, secondNumber;
        output = JOptionPane.showInputDialog(null, "Please enter the number to find the natural log of:", "Natural Log", JOptionPane.QUESTION_MESSAGE);
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
        secondNumber = Math.log(firstNumber);
        output = "The natural log of " + firstNumber + " is: " + secondNumber;
        JOptionPane.showMessageDialog(null, output, "Natural Log", JOptionPane.INFORMATION_MESSAGE);
    }
}