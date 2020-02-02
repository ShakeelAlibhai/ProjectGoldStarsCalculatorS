package projectgoldstarscalculators;
import components.ProgramWindow;
import components.Buttons;
import components.Labels;
import converters.TemperatureConverter;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
public class TemperatureConversions
{
    private static JTextField celsiusField, fahrenheitField, kelvinField;
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
        frame.add(Labels.standardLabel("Celsius:"));
        frame.add(celsiusField);
        frame.add(Buttons.button2("Convert From Celsius", new ConvertFromCelsiusListener()));
        frame.add(Labels.standardLabel("Fahrenheit:"));
        frame.add(fahrenheitField);
        frame.add(Buttons.button2("Convert From Fahrenheit", new ConvertFromFahrenheitListener()));
        frame.add(Labels.standardLabel("Kelvin:"));
        frame.add(kelvinField);
        frame.add(Buttons.button2("Convert From Kelvin", new ConvertFromKelvinListener()));
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
        @Override
        public void actionPerformed(ActionEvent e)
        {
            double c = 0.0;
            try
            {
                c = Double.parseDouble(celsiusField.getText());
            }
            catch(Exception e2)
            {
                JOptionPane.showMessageDialog(null, "ERROR", "Calculator", JOptionPane.ERROR_MESSAGE);
                return;
            }
            fahrenheitField.setText("" + conv.toFahrenheit("Celsius", c));
            kelvinField.setText("" + conv.toKelvin("Celsius", c));
        }
    }
    
    /*
    This is executed when the user attempts to convert from Fahrenheit.
    It attempts to convert the value in the Fahrenheit text field to Celsius and Kelvin,
    and then updates the Celsius and Kelvin text fields to equal the value in the Fahrenheit text field.
    */
    private class ConvertFromFahrenheitListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            double f = 0.0;
            try
            {
                f = Double.parseDouble(fahrenheitField.getText());
            }
            catch(Exception e2)
            {
                JOptionPane.showMessageDialog(null, "ERROR", "Calculator", JOptionPane.ERROR_MESSAGE);
                return;
            }
            celsiusField.setText("" + conv.toCelsius("Fahrenheit", f));
            kelvinField.setText("" + conv.toKelvin("Fahrenheit", f));
        }
    }
    
    /*
    This is executed when the user attempts to convert from Kelvin.
    It attempts to convert the value in the Kelvin text field to Celsius and Fahrenheit,
    and then updates the Celsius and Fahrenheit text fields to equal the value in the Kelvin text field.
    */
    private class ConvertFromKelvinListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            double k = 0.0;
            try
            {
                k = Double.parseDouble(kelvinField.getText());
            }
            catch(Exception e2)
            {
                JOptionPane.showMessageDialog(null, "ERROR", "Calculator", JOptionPane.ERROR_MESSAGE);
                return;
            }
            celsiusField.setText("" + conv.toCelsius("Kelvin", k));
            fahrenheitField.setText("" + conv.toFahrenheit("Kelvin", k));
        }
    }
}