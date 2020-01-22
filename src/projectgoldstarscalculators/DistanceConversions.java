package projectgoldstarscalculators;
import components.ProgramWindow;
import components.Buttons;
import components.Labels;
import converters.DistanceConverter;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
public class DistanceConversions
{
    private static JTextField feetField, milesField, kilometersField;
    private DistanceConverter conv;
    
    public DistanceConversions()
    {
        temperatureConversions();
    }
    
    private void temperatureConversions()
    {
        conv = new DistanceConverter();
        ProgramWindow frame = new ProgramWindow("Distance Conversions");
        frame.setLayout(new GridLayout(3, 3));
        frame.setSize(875 * Main.multiplier, 475 * Main.multiplier);
        frame.setInstructionsMenuBar("Please fill in one of the fields, and then press the corresponding button to convert to the other units.");
        setupFeetField();
        setupMilesField();
        setupKilometersField();
        frame.add(Labels.standardLabel("Feet:"));
        frame.add(feetField);
        frame.add(Buttons.button2("Convert From Feet", new ConvertFromFeetListener()));
        frame.add(Labels.standardLabel("Miles:"));
        frame.add(milesField);
        frame.add(Buttons.button2("Convert From Miles", new ConvertFromMilesListener()));
        frame.add(Labels.standardLabel("Kilometers:"));
        frame.add(kilometersField);
        frame.add(Buttons.button2("Convert From Kilometers", new ConvertFromKilometersListener()));
        frame.makeVisible();
    }
    
    private void setupFeetField()
    {
        feetField = new JTextField("0");
        feetField.setFont(Main.bodyText2);
    }
    
    private void setupMilesField()
    {
        milesField = new JTextField("0");
        milesField.setFont(Main.bodyText2);
    }
    
    private void setupKilometersField()
    {
        kilometersField = new JTextField("0");
        kilometersField.setFont(Main.bodyText2);
    }
    
    /*
    This is executed when the user attempts to convert from Feet.
    It attempts to convert the value in the Feet text field to Miles and Kilometers,
    and then updates the Miles and Kilometers text fields to equal the value in the Feet text field.
    */
    private class ConvertFromFeetListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            double c = 0.0;
            try
            {
                String temp = feetField.getText();
                c = Double.parseDouble(temp);
            }
            catch(Exception e2)
            {
                JOptionPane.showMessageDialog(null, "ERROR", "Calculator", JOptionPane.ERROR_MESSAGE);
                return;
            }
            milesField.setText("" + conv.toMiles("Feet", c));
            kilometersField.setText("" + conv.toKilometers("Feet", c));
        }
    }
    
    /*
    This is executed when the user attempts to convert from Miles.
    It attempts to convert the value in the Miles text field to Feet and Kilometers,
    and then updates the Feet and Kilometers text fields to equal the value in the Miles text field.
    */
    private class ConvertFromMilesListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            double f = 0.0;
            try
            {
                String temp = milesField.getText();
                f = Double.parseDouble(temp);
            }
            catch(Exception e2)
            {
                JOptionPane.showMessageDialog(null, "ERROR", "Calculator", JOptionPane.ERROR_MESSAGE);
                return;
            }
            feetField.setText("" + conv.toFeet("Miles", f));
            kilometersField.setText("" + conv.toKilometers("Miles", f));
        }
    }
    
    /*
    This is executed when the user attempts to convert from Kilometers.
    It attempts to convert the value in the Kilometers text field to Feet and Miles,
    and then updates the Feet and Miles text fields to equal the value in the Kilometers text field.
    */
    private class ConvertFromKilometersListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            double k = 0.0;
            try
            {
                String temp = kilometersField.getText();
                k = Double.parseDouble(temp);
            }
            catch(Exception e2)
            {
                JOptionPane.showMessageDialog(null, "ERROR", "Calculator", JOptionPane.ERROR_MESSAGE);
                return;
            }
            feetField.setText("" + conv.toFeet("Kilometers", k));
            milesField.setText("" + conv.toMiles("Kilometers", k));
        }
    }
}