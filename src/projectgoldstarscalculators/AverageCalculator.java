package projectgoldstarscalculators;
import javax.swing.JOptionPane;
public class AverageCalculator
{
    public AverageCalculator()
    {
        calcAverage();
    }
    
    private void calcAverage()
    {
        String output, temp;
        int int1;
        double int2;
        double total = 0.0;
        //Ask the user to enter the number of numbers to find the average of.
        //The number of numbers to find the average of is stored as a String.
        temp = "How many numbers do you want to find the average of?";
        output = JOptionPane.showInputDialog(null, temp, "Average Calculator", JOptionPane.QUESTION_MESSAGE);
        if(output == null)
        {
            return;
        }
        //Attempt to convert the number of numbers to find the average of from a String to an int.
        //If the conversion fails, display an error message and exit the method.
        try
        {
            int1 = Integer.parseInt(output);
        }
        catch(Exception error)
        {
            JOptionPane.showMessageDialog(null, "ERROR", "Average Calculator", JOptionPane.ERROR_MESSAGE);
            return;
        }
        //If the number of numbers to find the average of is less than or equal to 0, display an error message and exit the method.
        if(int1 <= 0)
        {
            output = "ERROR:\n"
                    + "The number of numbers to find the average of is less than or equal to 0.";
            JOptionPane.showMessageDialog(null, output, "Average Calculator", JOptionPane.ERROR_MESSAGE);
            return;
        }
        for(int i = 0; i < int1; i++)
        {
            //Ask the user to enter Number #i.
            //Number #i is stored as a String.
            temp = "Please enter Number #" + (i + 1) + ":";
            output = JOptionPane.showInputDialog(null, temp, "Average Calculator", JOptionPane.QUESTION_MESSAGE);
            if(output == null)
            {
                return;
            }
            //Attempt to convert Number #i from a String to a Double.
            //If the conversion fails, display an error message and exit the method.
            try
            {
                int2 = Double.parseDouble(output);
            }
            catch(Exception error)
            {
                JOptionPane.showMessageDialog(null, "ERROR", "Average Calculator", JOptionPane.ERROR_MESSAGE);
                return;
            }
            total += int2;
        }
        total = total / int1;
        output = "The average of the numbers is: " + total;
        JOptionPane.showMessageDialog(null, output, "Average Calculator", JOptionPane.INFORMATION_MESSAGE);
    }
}