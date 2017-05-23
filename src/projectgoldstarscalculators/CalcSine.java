package projectgoldstarscalculators;
import javax.swing.JOptionPane;
public class CalcSine
{
    public CalcSine()
    {
        sine();
    }
    
    private void sine()
    {
        String output;
        double input;
        output = JOptionPane.showInputDialog(null, "Please enter the number of radians to find the sine of:", "Sine", JOptionPane.QUESTION_MESSAGE);
        if(output == null)
        {
            return;
        }
        try
        {
            input = Double.parseDouble(output);
        }
        catch(Exception error)
        {
            return;
        }
        double sine = Math.sin(input);
        output = "The sine of " + input + " radians is: " + sine;
        JOptionPane.showMessageDialog(null, output, "Sine", JOptionPane.INFORMATION_MESSAGE);
    }
}