package projectgoldstarscalculators;
import components.ProgramWindow;
import components.Buttons;
import components.StandardLabel;
import converters.DistanceConverter;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
public class DistanceConversions
{
    private static JTextField inchesField, feetField, milesField, kilometersField;
    private DistanceConverter conv;
    
    public DistanceConversions()
    {
        temperatureConversions();
    }
    
    private void temperatureConversions()
    {
        conv = new DistanceConverter();
        ProgramWindow frame = new ProgramWindow("Distance Conversions");
        frame.setLayout(new GridLayout(4, 3));
        frame.setSize(875 * Main.multiplier, 475 * Main.multiplier);
        frame.setInstructionsMenuBar("Please fill in one of the fields, and then press the corresponding button to convert to the other units.");
        setupInchesField();
        setupFeetField();
        setupMilesField();
        setupKilometersField();
        frame.add(new StandardLabel("Inches:"));
        frame.add(inchesField);
        frame.add(Buttons.button2("Convert From Inches", new ConvertFromInchesListener()));
        frame.add(new StandardLabel("Feet:"));
        frame.add(feetField);
        frame.add(Buttons.button2("Convert From Feet", new ConvertFromFeetListener()));
        frame.add(new StandardLabel("Miles:"));
        frame.add(milesField);
        frame.add(Buttons.button2("Convert From Miles", new ConvertFromMilesListener()));
        frame.add(new StandardLabel("Kilometers:"));
        frame.add(kilometersField);
        frame.add(Buttons.button2("Convert From Kilometers", new ConvertFromKilometersListener()));
        frame.makeVisible();
    }
    
    private void setupInchesField()
    {
        inchesField = new JTextField("0");
        inchesField.setFont(Main.bodyText2);
        inchesField.addActionListener(new ConvertFromInchesListener());
    }
    
    private void setupFeetField()
    {
        feetField = new JTextField("0");
        feetField.setFont(Main.bodyText2);
        feetField.addActionListener(new ConvertFromFeetListener());
    }
    
    private void setupMilesField()
    {
        milesField = new JTextField("0");
        milesField.setFont(Main.bodyText2);
        milesField.addActionListener(new ConvertFromMilesListener());
    }
    
    private void setupKilometersField()
    {
        kilometersField = new JTextField("0");
        kilometersField.setFont(Main.bodyText2);
        kilometersField.addActionListener(new ConvertFromKilometersListener());
    }
    
    private class ConvertFromInchesListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            double c;
            try
            {
                c = Double.parseDouble(inchesField.getText());
            }
            catch(Exception e2)
            {
                JOptionPane.showMessageDialog(null, "ERROR", "Calculator", JOptionPane.ERROR_MESSAGE);
                return;
            }
            feetField.setText("" + conv.toFeet("Inches", c));
            milesField.setText("" + conv.toMiles("Inches", c));
            kilometersField.setText("" + conv.toKilometers("Inches", c));
        }
    }
    
    private class ConvertFromFeetListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            double c;
            try
            {
                c = Double.parseDouble(feetField.getText());
            }
            catch(Exception e2)
            {
                JOptionPane.showMessageDialog(null, "ERROR", "Calculator", JOptionPane.ERROR_MESSAGE);
                return;
            }
            inchesField.setText("" + conv.toInches("Feet", c));
            milesField.setText("" + conv.toMiles("Feet", c));
            kilometersField.setText("" + conv.toKilometers("Feet", c));
        }
    }
    
    private class ConvertFromMilesListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            double f;
            try
            {
                f = Double.parseDouble(milesField.getText());
            }
            catch(Exception e2)
            {
                JOptionPane.showMessageDialog(null, "ERROR", "Calculator", JOptionPane.ERROR_MESSAGE);
                return;
            }
            inchesField.setText("" + conv.toInches("Miles", f));
            feetField.setText("" + conv.toFeet("Miles", f));
            kilometersField.setText("" + conv.toKilometers("Miles", f));
        }
    }
    
    private class ConvertFromKilometersListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            double k;
            try
            {
                k = Double.parseDouble(kilometersField.getText());
            }
            catch(Exception e2)
            {
                JOptionPane.showMessageDialog(null, "ERROR", "Calculator", JOptionPane.ERROR_MESSAGE);
                return;
            }
            inchesField.setText("" + conv.toInches("Kilometers", k));
            feetField.setText("" + conv.toFeet("Kilometers", k));
            milesField.setText("" + conv.toMiles("Kilometers", k));
        }
    }
}