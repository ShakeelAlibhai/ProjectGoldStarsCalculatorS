package projectgoldstarscalculators;
import components.ProgramWindow;
import components.Buttons;
import components.Labels;
import components.ResultField;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
public class Exponents
{
    private static JTextField baseField, exponentField;
    private static ResultField rf;
    
    public Exponents()
    {
        exponent();
    }
    
    private void exponent()
    {
        ProgramWindow frame = new ProgramWindow("Exponents");
        frame.setLayout(new GridLayout(4, 2));
        frame.setSize(750 * Main.multiplier, 400 * Main.multiplier);
        frame.setInstructionsMenuBar("Please enter the following information:");
        frame.add(Labels.standardLabel("Base:"));
        setupBaseField();
        frame.add(baseField);
        frame.add(Labels.standardLabel("Exponent:"));
        setupExponentField();
        frame.add(exponentField);
        frame.add(new JLabel());
        frame.add(Buttons.button2("Calculate", new CalculateListener()));
        frame.add(Labels.standardLabel("Result:"));
        rf = new ResultField();
        frame.add(rf);
        frame.makeVisible();
    }
    
    private void setupBaseField()
    {
        baseField = new JTextField("0");
        baseField.setFont(Main.bodyText2);
        baseField.addActionListener(new CalculateListener());
    }
    
    private void setupExponentField()
    {
        exponentField = new JTextField("0");
        exponentField.setFont(Main.bodyText2);
        exponentField.addActionListener(new CalculateListener());
    }
    
    public static class CalculateListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            String baseStr = baseField.getText();
            String exponentStr = exponentField.getText();
            double baseD, exponentD;
            try
            {
                baseD = Double.parseDouble(baseStr);
            }
            catch(Exception e2)
            {
                JOptionPane.showMessageDialog(null, "ERROR", "Exponents", JOptionPane.ERROR_MESSAGE);
                return;
            }
            try
            {
                exponentD = Double.parseDouble(exponentStr);
            }
            catch(Exception e2)
            {
                JOptionPane.showMessageDialog(null, "ERROR", "Exponents", JOptionPane.ERROR_MESSAGE);
                return;
            }
            rf.updateText("" + Math.pow(baseD, exponentD));
        }
    }
}