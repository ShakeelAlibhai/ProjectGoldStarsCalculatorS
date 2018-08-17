package projectgoldstarscalculators;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
public class Circles
{
    public static JTextField radiusField;
    
    public Circles()
    {
        circles();
    }
    
    private void circles()
    {
        ProgramWindow frame = new ProgramWindow("Circles");
        frame.setLayout(new GridLayout(2, 2));
        frame.setSize(650 * ProjectGoldStarsCalculatorS.multiplier, 350 * ProjectGoldStarsCalculatorS.multiplier);
        frame.setInstructionsMenuBar("Please enter the following information:");
        frame.add(Components.standardLabel("Radius:"));
        setupRadiusField();
        frame.add(radiusField);
        frame.add(new JLabel());
        frame.add(Components.button2("Calculate", new CalculateListener()));
        frame.makeVisible();
    }
    
    private void setupRadiusField()
    {
        radiusField = new JTextField("0");
        radiusField.setFont(ProjectGoldStarsCalculatorS.bodyText2);
        radiusField.addActionListener(new CalculateListener());
    }
    
    public static class CalculateListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            String output;
            //Get the user's input from the radius text field and store it in radiusStr
            String radiusStr = radiusField.getText();
            //Attempt to convert radiusStr to a double; if it cannot be converted, display an error message
            double radiusD;
            try
            {
                radiusD = Double.parseDouble(radiusStr);
            }
            catch(Exception e2)
            {
                JOptionPane.showMessageDialog(null, "ERROR", "Circles", JOptionPane.ERROR_MESSAGE);
                return;
            }
            //Print an error message if the value entered is less than or equal to 0
            if(radiusD <= 0)
            {
                output = "ERROR:\n"
                        + "The radius of the circle is less than or equal to 0.";
                JOptionPane.showMessageDialog(null, output, "Circles", JOptionPane.ERROR_MESSAGE);
                return;
            }
            //Calculate the area.
            double area = Math.PI * radiusD * radiusD;
            //Calculate the circumference.
            double circumference = 2 * Math.PI * radiusD;
            //Display the area and circumference.
            output = "Area of the Circle: " + area + "\n"
                    + "Circumference of the Circle: " + circumference;
            JOptionPane.showMessageDialog(null, output, "Circles", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}