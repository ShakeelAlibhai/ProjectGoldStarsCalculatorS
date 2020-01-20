package projectgoldstarscalculators;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
public class Rectangles
{
    public static JTextField lengthField, widthField;
    
    public Rectangles()
    {
        calcRectangleInformation();
    }
    
    private void calcRectangleInformation()
    {
        ProgramWindow frame = new ProgramWindow("Rectangles");
        frame.setLayout(new GridLayout(3, 2));
        frame.setSize(800 * Main.multiplier, 425 * Main.multiplier);
        frame.setInstructionsMenuBar("Please enter the following information, and then press Calculate to find the area and perimeter:");
        frame.add(Labels.standardLabel("Length:"));
        setupLengthField();
        frame.add(lengthField);
        frame.add(Labels.standardLabel("Width:"));
        setupWidthField();
        frame.add(widthField);
        frame.add(new JLabel());
        frame.add(Buttons.button2("Calculate", new CalculateListener()));
        frame.makeVisible();
    }
    
    private void setupLengthField()
    {
        lengthField = new JTextField("0");
        lengthField.setFont(Main.bodyText2);
    }
    
    private void setupWidthField()
    {
        widthField = new JTextField("0");
        widthField.setFont(Main.bodyText2);
    }
    
    public static class CalculateListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            String output;
            String lengthStr = lengthField.getText();
            String widthStr = widthField.getText();
            double lengthD, widthD;
            try
            {
                lengthD = Double.parseDouble(lengthStr);
            }
            catch(Exception e2)
            {
                JOptionPane.showMessageDialog(null, "ERROR", "Rectangles", JOptionPane.ERROR_MESSAGE);
                return;
            }
            try
            {
                widthD = Double.parseDouble(widthStr);
            }
            catch(Exception e2)
            {
                JOptionPane.showMessageDialog(null, "ERROR", "Rectangles", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if(lengthD <= 0)
            {
                output = "ERROR:\n"
                        + "The length of the rectangle is less than or equal to 0.";
                JOptionPane.showMessageDialog(null, output, "Rectangles", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if(widthD <= 0)
            {
                output = "ERROR:\n"
                        + "The width of the rectangle is less than or equal to 0.";
                JOptionPane.showMessageDialog(null, output, "Rectangles", JOptionPane.ERROR_MESSAGE);
                return;
            }
            //Calculate the area.
            double area = lengthD * widthD;
            //Calculate the perimeter.
            double perimeter = lengthD + lengthD + widthD + widthD;
            //Display the area and perimeter.
            output = "Area of the Rectangle: " + area + "\n"
                    + "Perimeter of the Rectangle: " + perimeter;
            JOptionPane.showMessageDialog(null, output, "Rectangles", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}