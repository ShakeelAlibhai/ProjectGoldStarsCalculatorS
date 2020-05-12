package projectgoldstarscalculators;
import components.ProgramWindow;
import components.Buttons;
import components.StandardLabel;
import converters.VolumeConverter;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
public class VolumeConversions
{
    private static JTextField cubicMetersField, gallonsField, litersField;
    private VolumeConverter conv;
    
    public VolumeConversions()
    {
        volumeConversions();
    }
    
    private void volumeConversions()
    {
        conv = new VolumeConverter();
        ProgramWindow frame = new ProgramWindow("Volume Conversions");
        frame.setLayout(new GridLayout(3, 3));
        frame.setSize(875 * Main.multiplier, 475 * Main.multiplier);
        frame.setInstructionsMenuBar("Please fill in one of the fields, and then press the corresponding button to convert to the other units.");
        setupCubicMetersField();
        setupGallonsField();
        setupLitersField();
        frame.add(new StandardLabel("Cubic Meters:"));
        frame.add(cubicMetersField);
        frame.add(Buttons.button2("Convert From Cubic Meters", new ConvertFromCubicMetersListener()));
        frame.add(new StandardLabel("Gallons:"));
        frame.add(gallonsField);
        frame.add(Buttons.button2("Convert From Gallons", new ConvertFromGallonsListener()));
        frame.add(new StandardLabel("Liters:"));
        frame.add(litersField);
        frame.add(Buttons.button2("Convert From Liters", new ConvertFromLitersListener()));
        frame.makeVisible();
    }
    
    private void setupCubicMetersField()
    {
        cubicMetersField = new JTextField("0");
        cubicMetersField.setFont(Main.bodyText2);
        cubicMetersField.addActionListener(new ConvertFromCubicMetersListener());
    }
    
    private void setupGallonsField()
    {
        gallonsField = new JTextField("0");
        gallonsField.setFont(Main.bodyText2);
        gallonsField.addActionListener(new ConvertFromGallonsListener());
    }
    
    private void setupLitersField()
    {
        litersField = new JTextField("0");
        litersField.setFont(Main.bodyText2);
        litersField.addActionListener(new ConvertFromLitersListener());
    }
    
    private class ConvertFromCubicMetersListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            double vol = 0.0;
            try
            {
                vol = Double.parseDouble(cubicMetersField.getText());
            }
            catch(Exception e2)
            {
                JOptionPane.showMessageDialog(null, "ERROR", "Calculator", JOptionPane.ERROR_MESSAGE);
                return;
            }
            gallonsField.setText("" + conv.toGallons("Cubic Meters", vol));
            litersField.setText("" + conv.toLiters("Cubic Meters", vol));
        }
    }
    
    private class ConvertFromGallonsListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            double vol = 0.0;
            try
            {
                vol = Double.parseDouble(gallonsField.getText());
            }
            catch(Exception e2)
            {
                JOptionPane.showMessageDialog(null, "ERROR", "Calculator", JOptionPane.ERROR_MESSAGE);
                return;
            }
            cubicMetersField.setText("" + conv.toCubicMeters("Gallons", vol));
            litersField.setText("" + conv.toLiters("Gallons", vol));
        }
    }
    
    private class ConvertFromLitersListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            double vol = 0.0;
            try
            {
                vol = Double.parseDouble(litersField.getText());
            }
            catch(Exception e2)
            {
                JOptionPane.showMessageDialog(null, "ERROR", "Calculator", JOptionPane.ERROR_MESSAGE);
                return;
            }
            cubicMetersField.setText("" + conv.toCubicMeters("Liters", vol));
            gallonsField.setText("" + conv.toGallons("Liters", vol));
        }
    }
}