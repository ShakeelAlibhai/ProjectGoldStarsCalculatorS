package projectgoldstarscalculators;
import components.ProgramWindow;
import components.Buttons;
import components.ResultField;
import components.StandardLabel;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
public class Triangles
{
    private static JTextField baseField, heightField;
    private static ResultField areaField;
    
    public Triangles()
    {
        calcRectangleInformation();
    }
    
    private void calcRectangleInformation()
    {
        ProgramWindow frame = new ProgramWindow("Triangles");
        frame.setLayout(new GridLayout(4, 2));
        frame.setSize(750 * Main.multiplier, 400 * Main.multiplier);
        frame.setInstructionsMenuBar("Please enter the following information, and then press Calculate to find the area:");
        frame.add(new StandardLabel("Base:"));
        setupBaseField();
        frame.add(baseField);
        frame.add(new StandardLabel("Height:"));
        setupHeightField();
        frame.add(heightField);
        frame.add(new JLabel());
        frame.add(Buttons.button2("Calculate", new CalculateListener()));
        frame.add(new StandardLabel("Area:"));
        areaField = new ResultField();
        frame.add(areaField);
        frame.makeVisible();
    }
    
    private void setupBaseField()
    {
        baseField = new JTextField("0");
        baseField.setFont(Main.bodyText2);
    }
    
    private void setupHeightField()
    {
        heightField = new JTextField("0");
        heightField.setFont(Main.bodyText2);
    }
    
    public static class CalculateListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            String output;
            String baseStr = baseField.getText();
            String heightStr = heightField.getText();
            double baseD, heightD;
            try
            {
                baseD = Double.parseDouble(baseStr);
            }
            catch(Exception e2)
            {
                JOptionPane.showMessageDialog(null, "ERROR", "Triangles", JOptionPane.ERROR_MESSAGE);
                return;
            }
            try
            {
                heightD = Double.parseDouble(heightStr);
            }
            catch(Exception e2)
            {
                JOptionPane.showMessageDialog(null, "ERROR", "Triangles", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if(baseD <= 0)
            {
                output = "ERROR:\n"
                        + "The base of the triangle is less than or equal to 0.";
                JOptionPane.showMessageDialog(null, output, "Triangles", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if(heightD <= 0)
            {
                output = "ERROR:\n"
                        + "The height of the triangle is less than or equal to 0.";
                JOptionPane.showMessageDialog(null, output, "Triangles", JOptionPane.ERROR_MESSAGE);
                return;
            }
            //Calculate the area.
            double area = 0.5 * baseD * heightD;
            //Display the area.
            areaField.updateText("" + area);
        }
    }
}