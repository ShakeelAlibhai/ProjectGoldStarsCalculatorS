package projectgoldstarscalculators;
import components.ProgramWindow;
import components.Buttons;
import components.DisclaimerLabel;
import components.ResultField;
import components.StandardLabel;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
public class Circles
{
    private static JTextField radiusField;
    private static ResultField areaField, circumferenceField;
    
    public Circles()
    {
        circles();
    }
    
    private void circles()
    {
        ProgramWindow frame = new ProgramWindow("Circles");
        frame.setLayout(new GridLayout(3, 3));
        frame.setSize(800 * Main.multiplier, 425 * Main.multiplier);
        frame.setInstructionsMenuBar("Please enter the radius of the circle, and then press Calculate to find its area and circumference:");
        frame.add(new StandardLabel("Radius:"));
        setupRadiusField();
        frame.add(radiusField);
        frame.add(Buttons.button2("Calculate", new CalculateListener()));
        frame.add(new StandardLabel("Area:"));
        areaField = new ResultField();
        frame.add(areaField);
        frame.add(new JLabel());
        frame.add(new StandardLabel("Circumference:"));
        circumferenceField = new ResultField();
        frame.add(circumferenceField);
        frame.add(new DisclaimerLabel("Note: Values may not be exact."));
        frame.makeVisible();
    }
    
    private void setupRadiusField()
    {
        radiusField = new JTextField("0");
        radiusField.setFont(Main.bodyText2);
        radiusField.addActionListener(new CalculateListener());
    }
    
    public static class CalculateListener implements ActionListener
    {
        @Override
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
            areaField.updateText("" + area);
            circumferenceField.updateText("" + circumference);
        }
    }
}