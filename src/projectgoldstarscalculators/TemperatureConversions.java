package projectgoldstarscalculators;
import converters.TemperatureConverter;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
public class TemperatureConversions
{
    public static JTextField celsiusField, fahrenheitField, kelvinField;
    private TemperatureConverter conv;
    
    public TemperatureConversions()
    {
        temperatureConversions();
    }
    
    private void temperatureConversions()
    {
        conv = new TemperatureConverter();
        ProgramWindow frame = new ProgramWindow("Temperature Conversions");
        frame.setLayout(new GridLayout(3, 3));
        frame.setSize(875 * Main.multiplier, 475 * Main.multiplier);
        frame.setInstructionsMenuBar("Please fill in one of the fields, and then press the corresponding button to convert to the other units.");
        setupCelsiusField();
        setupFahrenheitField();
        setupKelvinField();
        frame.add(Components.standardLabel("Celsius:"));
        frame.add(celsiusField);
        frame.add(Components.button2("Convert From Celsius", new ConvertFromCelsiusListener()));
        frame.add(Components.standardLabel("Fahrenheit:"));
        frame.add(fahrenheitField);
        frame.add(Components.button2("Convert From Fahrenheit", new ConvertFromFahrenheitListener()));
        frame.add(Components.standardLabel("Kelvin:"));
        frame.add(kelvinField);
        frame.add(Components.button2("Convert From Kelvin", new ConvertFromKelvinListener()));
        frame.makeVisible();
    }
    
    private void setupCelsiusField()
    {
        celsiusField = new JTextField("0");
        celsiusField.setFont(Main.bodyText2);
    }
    
    private void setupFahrenheitField()
    {
        fahrenheitField = new JTextField("0");
        fahrenheitField.setFont(Main.bodyText2);
    }
    
    private void setupKelvinField()
    {
        kelvinField = new JTextField("0");
        kelvinField.setFont(Main.bodyText2);
    }
    
    /*
    This is executed when the user attempts to convert from Celsius.
    It attempts to convert the value in the Celsius text field to Fahrenheit and Kelvin,
    and then updates the Fahrenheit and Kelvin text fields to equal the value in the Celsius text field.
    */
    private class ConvertFromCelsiusListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            double c = 0.0, f = 0.0, k = 0.0;
            try
            {
                String temp = celsiusField.getText();
                c = Double.parseDouble(temp);
            }
            catch(Exception e2)
            {
                JOptionPane.showMessageDialog(null, "ERROR", "Calculator", JOptionPane.ERROR_MESSAGE);
                return;
            }
            f = conv.toFahrenheit("Celsius", c);
            String temp2 = "" + f;
            fahrenheitField.setText(temp2);
            k = c + 273.15;
            temp2 = "" + k;
            kelvinField.setText(temp2);
        }
    }
    
    /*
    This is executed when the user attempts to convert from Fahrenheit.
    It attempts to convert the value in the Fahrenheit text field to Celsius and Kelvin,
    and then updates the Celsius and Kelvin text fields to equal the value in the Fahrenheit text field.
    */
    private class ConvertFromFahrenheitListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            double c = 0.0, f = 0.0, k = 0.0;
            try
            {
                String temp = fahrenheitField.getText();
                f = Double.parseDouble(temp);
            }
            catch(Exception e2)
            {
                JOptionPane.showMessageDialog(null, "ERROR", "Calculator", JOptionPane.ERROR_MESSAGE);
                return;
            }
            c = conv.toCelsius("Fahrenheit", f);
            String temp2 = "" + c;
            celsiusField.setText(temp2);
            k = c + 273.15;
            temp2 = "" + k;
            kelvinField.setText(temp2);
        }
    }
    
    /*
    This is executed when the user attempts to convert from Kelvin.
    It attempts to convert the value in the Kelvin text field to Celsius and Fahrenheit,
    and then updates the Celsius and Fahrenheit text fields to equal the value in the Kelvin text field.
    */
    private class ConvertFromKelvinListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            double c = 0.0, f = 0.0, k = 0.0;
            try
            {
                String temp = kelvinField.getText();
                k = Double.parseDouble(temp);
            }
            catch(Exception e2)
            {
                JOptionPane.showMessageDialog(null, "ERROR", "Calculator", JOptionPane.ERROR_MESSAGE);
                return;
            }
            c = conv.toCelsius("Kelvin", k);
            String temp2 = "" + c;
            celsiusField.setText(temp2);
            f = conv.toFahrenheit("Kelvin", k);
            temp2 = "" + f;
            fahrenheitField.setText(temp2);
        }
    }
}