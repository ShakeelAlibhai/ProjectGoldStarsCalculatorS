package projectgoldstarscalculators;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
public class TemperatureConversions
{
    public static JTextField tf1, tf2, tf3;
    
    public TemperatureConversions()
    {
        temperatureConversions();
    }
    
    private void temperatureConversions()
    {
        ProgramWindow additionFrame = new ProgramWindow("Temperature Conversions");
        additionFrame.setLayout(new GridLayout(3, 3));
        additionFrame.setSize(750 * ProjectGoldStarsCalculatorS.multiplier, 375 * ProjectGoldStarsCalculatorS.multiplier);
        additionFrame.setInstructionsMenuBar("Please fill one of the fields and then press the button to convert to the other units.");
        JLabel number1 = new JLabel("Celsius:");
        number1.setForeground(ProjectGoldStarsCalculatorS.color2);
        number1.setFont(ProjectGoldStarsCalculatorS.bodyText1);
        JLabel number2 = new JLabel("Fahrenheit:");
        number2.setForeground(ProjectGoldStarsCalculatorS.color2);
        number2.setFont(ProjectGoldStarsCalculatorS.bodyText1);
        JLabel number3 = new JLabel("Kelvin:");
        number3.setForeground(ProjectGoldStarsCalculatorS.color2);
        number3.setFont(ProjectGoldStarsCalculatorS.bodyText1);
        tf1 = new JTextField("0");
        tf1.setFont(ProjectGoldStarsCalculatorS.bodyText2);
        tf2 = new JTextField("0");
        tf2.setFont(ProjectGoldStarsCalculatorS.bodyText2);
        tf3 = new JTextField("0");
        tf3.setFont(ProjectGoldStarsCalculatorS.bodyText2);
        additionFrame.add(number1);
        additionFrame.add(tf1);
        additionFrame.add(Components.button2("Convert From Celsius", new ConvertFromCelsiusListener()));
        additionFrame.add(number2);
        additionFrame.add(tf2);
        additionFrame.add(Components.button2("Convert From Fahrenheit", new ConvertFromFahrenheitListener()));
        additionFrame.add(number3);
        additionFrame.add(tf3);
        additionFrame.add(Components.button2("Convert From Kelvin", new ConvertFromKelvinListener()));
        additionFrame.makeVisible();
    }
    
    private class ConvertFromCelsiusListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            double c = 0.0, f = 0.0, k = 0.0;
            try
            {
                String temp = tf1.getText();
                c = Double.parseDouble(temp);
            }
            catch(Exception e2)
            {
                JOptionPane.showMessageDialog(null, "ERROR", "Calculator", JOptionPane.ERROR_MESSAGE);
                return;
            }
            f = c * 9;
            f /= 5;
            f += 32;
            String temp2 = "" + f;
            tf2.setText(temp2);
            k = c + 273.15;
            temp2 = "" + k;
            tf3.setText(temp2);
        }
    }
    
    private class ConvertFromFahrenheitListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            double c = 0.0, f = 0.0, k = 0.0;
            try
            {
                String temp = tf2.getText();
                f = Double.parseDouble(temp);
            }
            catch(Exception e2)
            {
                JOptionPane.showMessageDialog(null, "ERROR", "Calculator", JOptionPane.ERROR_MESSAGE);
                return;
            }
            c = f - 32;
            c *= 5;
            c /= 9;
            String temp2 = "" + c;
            tf1.setText(temp2);
            k = c + 273.15;
            temp2 = "" + k;
            tf3.setText(temp2);
        }
    }
    
    private class ConvertFromKelvinListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            double c = 0.0, f = 0.0, k = 0.0;
            try
            {
                String temp = tf3.getText();
                k = Double.parseDouble(temp);
            }
            catch(Exception e2)
            {
                JOptionPane.showMessageDialog(null, "ERROR", "Calculator", JOptionPane.ERROR_MESSAGE);
                return;
            }
            c = k - 273.15;
            String temp2 = "" + c;
            tf1.setText(temp2);
            f = c * 9;
            f /= 5;
            f += 32;
            temp2 = "" + f;
            tf2.setText(temp2);
        }
    }
}