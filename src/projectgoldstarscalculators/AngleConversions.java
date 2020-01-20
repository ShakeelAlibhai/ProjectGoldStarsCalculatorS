package projectgoldstarscalculators;
import components.Buttons;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
public class AngleConversions
{
    public static JTextField degreesField, radiansField;
    
    public AngleConversions()
    {
        angleConversions();
    }
    
    private void angleConversions()
    {
        ProgramWindow frame = new ProgramWindow("Angle Conversions");
        frame.setLayout(new GridLayout(2, 3));
        frame.setSize(750 * Main.multiplier, 375 * Main.multiplier);
        frame.setInstructionsMenuBar("Please fill one of the fields and then press the button to convert to the other unit.");
        frame.add(descriptionLabel("Degrees:"));
        setupDegreesField();
        frame.add(degreesField);
        frame.add(Buttons.button2("Convert From Degrees", new ConvertFromDegreesListener()));
        frame.add(descriptionLabel("Radians:"));
        setupRadiansField();
        frame.add(radiansField);
        frame.add(Buttons.button2("Convert From Radians", new ConvertFromRadiansListener()));
        frame.makeVisible();
    }
    
    private JLabel descriptionLabel(String text)
    {
        JLabel descriptionLabel = new JLabel(text);
        descriptionLabel.setForeground(Main.secondaryColor);
        descriptionLabel.setFont(Main.bodyText1);
        return descriptionLabel;
    }
    
    private void setupDegreesField()
    {
        degreesField = new JTextField("0");
        degreesField.setFont(Main.bodyText2);
    }
    
    private void setupRadiansField()
    {
        radiansField = new JTextField("0");
        radiansField.setFont(Main.bodyText2);
    }
    
    /*
    This is executed when the user attempts to convert from degrees.
    It attempts to convert the value in the degrees text field to radians,
    and then updates the radians text field to equal the value in the degrees text field.
    */
    private class ConvertFromDegreesListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            double d = 0.0, r = 0.0;
            try
            {
                String temp = degreesField.getText();
                d = Double.parseDouble(temp);
            }
            catch(Exception e2)
            {
                JOptionPane.showMessageDialog(null, "ERROR", "Calculator", JOptionPane.ERROR_MESSAGE);
                return;
            }
            r = Math.toRadians(d);
            String temp2 = "" + r;
            radiansField.setText(temp2);
        }
    }
    
    /*
    This is executed when the user attempts to convert from radians.
    It attempts to convert the value in the radians text field to degrees,
    and then updates the degrees text field to equal the value in the radians text field.
    */
    private class ConvertFromRadiansListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            double d = 0.0, r = 0.0;
            try
            {
                String temp = radiansField.getText();
                r = Double.parseDouble(temp);
            }
            catch(Exception e2)
            {
                JOptionPane.showMessageDialog(null, "ERROR", "Calculator", JOptionPane.ERROR_MESSAGE);
                return;
            }
            d = Math.toDegrees(r);
            String temp2 = "" + d;
            degreesField.setText(temp2);
        }
    }
}