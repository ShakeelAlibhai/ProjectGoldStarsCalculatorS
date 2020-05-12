package projectgoldstarscalculators;
import components.ProgramWindow;
import components.Buttons;
import components.StandardLabel;
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
        frame.add(new StandardLabel("Celsius:"));
        frame.add(celsiusField);
        frame.add(Buttons.button2("Convert From Celsius", new ConvertFromCelsiusListener()));
        frame.add(new StandardLabel("Fahrenheit:"));
        frame.add(fahrenheitField);
        frame.add(Buttons.button2("Convert From Fahrenheit", new ConvertFromFahrenheitListener()));
        frame.add(new StandardLabel("Kelvin:"));
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
    
    private class ConvertFromCelsiusListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            double temp = 0.0;
            try
            {
                temp = Double.parseDouble(celsiusField.getText());
            }
            catch(Exception e2)
            {
                JOptionPane.showMessageDialog(null, "ERROR", "Calculator", JOptionPane.ERROR_MESSAGE);
                return;
            }
            fahrenheitField.setText("" + conv.toFahrenheit("Celsius", temp));
            kelvinField.setText("" + conv.toKelvin("Celsius", temp));
        }
    }
    
    private class ConvertFromFahrenheitListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            double temp = 0.0;
            try
            {
                temp = Double.parseDouble(fahrenheitField.getText());
            }
            catch(Exception e2)
            {
                JOptionPane.showMessageDialog(null, "ERROR", "Calculator", JOptionPane.ERROR_MESSAGE);
                return;
            }
            celsiusField.setText("" + conv.toCelsius("Fahrenheit", temp));
            kelvinField.setText("" + conv.toKelvin("Fahrenheit", temp));
        }
    }
    
    private class ConvertFromKelvinListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            double temp = 0.0;
            try
            {
                temp = Double.parseDouble(kelvinField.getText());
            }
            catch(Exception e2)
            {
                JOptionPane.showMessageDialog(null, "ERROR", "Calculator", JOptionPane.ERROR_MESSAGE);
                return;
            }
            celsiusField.setText("" + conv.toCelsius("Kelvin", temp));
            fahrenheitField.setText("" + conv.toFahrenheit("Kelvin", temp));
        }
    }
}