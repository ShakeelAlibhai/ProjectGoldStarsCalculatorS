package projectgoldstarscalculators;
import components.Buttons;
import components.Labels;
import converters.VolumeConverter;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
public class VolumeConversions
{
    private static JTextField gallonsField, litersField;
    private VolumeConverter conv;
    
    public VolumeConversions()
    {
        volumeConversions();
    }
    
    private void volumeConversions()
    {
        conv = new VolumeConverter();
        ProgramWindow frame = new ProgramWindow("Volume Conversions");
        frame.setLayout(new GridLayout(2, 3));
        frame.setSize(875 * Main.multiplier, 475 * Main.multiplier);
        frame.setInstructionsMenuBar("Please fill in one of the fields, and then press the corresponding button to convert to the other units.");
        setupGallonsField();
        setupLitersField();
        frame.add(Labels.standardLabel("Gallons:"));
        frame.add(gallonsField);
        frame.add(Buttons.button2("Convert From Gallons", new ConvertFromGallonsListener()));
        frame.add(Labels.standardLabel("Liters:"));
        frame.add(litersField);
        frame.add(Buttons.button2("Convert From Liters", new ConvertFromLitersListener()));
        frame.makeVisible();
    }
    
    private void setupGallonsField()
    {
        gallonsField = new JTextField("0");
        gallonsField.setFont(Main.bodyText2);
    }
    
    private void setupLitersField()
    {
        litersField = new JTextField("0");
        litersField.setFont(Main.bodyText2);
    }
    
    /*
    This is executed when the user attempts to convert from Gallons.
    It attempts to convert the value in the Gallons text field to Liters and Kelvin,
    and then updates the Liters and Kelvin text fields to equal the value in the Gallons text field.
    */
    private class ConvertFromGallonsListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            double c = 0.0;
            try
            {
                String temp = gallonsField.getText();
                c = Double.parseDouble(temp);
            }
            catch(Exception e2)
            {
                JOptionPane.showMessageDialog(null, "ERROR", "Calculator", JOptionPane.ERROR_MESSAGE);
                return;
            }
            litersField.setText("" + conv.toLiters("Gallons", c));
        }
    }
    
    /*
    This is executed when the user attempts to convert from Liters.
    It attempts to convert the value in the Liters text field to Gallons and Kelvin,
    and then updates the Gallons and Kelvin text fields to equal the value in the Liters text field.
    */
    private class ConvertFromLitersListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            double f = 0.0;
            try
            {
                String temp = litersField.getText();
                f = Double.parseDouble(temp);
            }
            catch(Exception e2)
            {
                JOptionPane.showMessageDialog(null, "ERROR", "Calculator", JOptionPane.ERROR_MESSAGE);
                return;
            }
            gallonsField.setText("" + conv.toGallons("Liters", f));
        }
    }
}