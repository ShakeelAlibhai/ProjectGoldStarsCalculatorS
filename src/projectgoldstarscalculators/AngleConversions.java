package projectgoldstarscalculators;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
public class AngleConversions
{
    public static JTextField tf1, tf2;
    
    public AngleConversions()
    {
        angleConversions();
    }
    
    private void angleConversions()
    {
        ProgramWindow additionFrame = new ProgramWindow("Angle Conversions");
        additionFrame.setLayout(new GridLayout(2, 3));
        additionFrame.setSize(750 * ProjectGoldStarsCalculatorS.multiplier, 375 * ProjectGoldStarsCalculatorS.multiplier);
        additionFrame.setInstructionsMenuBar("Please fill one of the fields and then press the button to convert to the other angles.");
        additionFrame.add(descriptionLabel("Degrees:"));
        setupTF1();
        additionFrame.add(tf1);
        additionFrame.add(Components.button2("Convert From Degrees", new ConvertFromDegreesListener()));
        additionFrame.add(descriptionLabel("Radians:"));
        setupTF2();
        additionFrame.add(tf2);
        additionFrame.add(Components.button2("Convert From Radians", new ConvertFromRadiansListener()));
        additionFrame.makeVisible();
    }
    
    private JLabel descriptionLabel(String text)
    {
        JLabel descriptionLabel = new JLabel(text);
        descriptionLabel.setForeground(ProjectGoldStarsCalculatorS.color2);
        descriptionLabel.setFont(ProjectGoldStarsCalculatorS.bodyText1);
        return descriptionLabel;
    }
    
    private void setupTF1()
    {
        tf1 = new JTextField("0");
        tf1.setFont(ProjectGoldStarsCalculatorS.bodyText2);
    }
    
    private void setupTF2()
    {
        tf2 = new JTextField("0");
        tf2.setFont(ProjectGoldStarsCalculatorS.bodyText2);
    }
    
    private class ConvertFromDegreesListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            double d = 0.0, r = 0.0;
            try
            {
                String temp = tf1.getText();
                d = Double.parseDouble(temp);
            }
            catch(Exception e2)
            {
                JOptionPane.showMessageDialog(null, "ERROR", "Calculator", JOptionPane.ERROR_MESSAGE);
                return;
            }
            r = Math.toRadians(d);
            String temp2 = "" + r;
            tf2.setText(temp2);
        }
    }
    
    private class ConvertFromRadiansListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            double d = 0.0, r = 0.0;
            try
            {
                String temp = tf2.getText();
                r = Double.parseDouble(temp);
            }
            catch(Exception e2)
            {
                JOptionPane.showMessageDialog(null, "ERROR", "Calculator", JOptionPane.ERROR_MESSAGE);
                return;
            }
            d = Math.toDegrees(r);
            String temp2 = "" + d;
            tf1.setText(temp2);
        }
    }
}