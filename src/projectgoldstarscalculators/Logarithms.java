package projectgoldstarscalculators;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
public class Logarithms implements ActionListener
{
    public static JTextField tf1, tf2, tf3;
    
    public Logarithms()
    {
        squareAndCubeRoots();
    }
    
    private void squareAndCubeRoots()
    {
        ProgramWindow frame = new ProgramWindow("Logarithms");
        frame.setLayout(new GridLayout(3, 3));
        frame.setSize(750 * ProjectGoldStarsCalculatorS.multiplier, 400 * ProjectGoldStarsCalculatorS.multiplier);
        frame.add(aLabel());
        setupTF1();
        frame.add(tf1);
        frame.add(Components.button2("Compute", new ComputeListener()));
        frame.add(bLabel());
        setupTF2();
        frame.add(tf2);
        frame.add(new JLabel());
        frame.add(cLabel());
        setupTF3();
        frame.add(tf3);
        frame.add(new JLabel());
        frame.makeVisible();
    }
    
    private JLabel aLabel()
    {
        JLabel aLabel = new JLabel("Number:");
        aLabel.setForeground(ProjectGoldStarsCalculatorS.color2);
        aLabel.setFont(ProjectGoldStarsCalculatorS.bodyText1);
        return aLabel;
    }
    
    private JLabel bLabel()
    {
        JLabel aLabel = new JLabel("Log Base 10:");
        aLabel.setForeground(ProjectGoldStarsCalculatorS.color2);
        aLabel.setFont(ProjectGoldStarsCalculatorS.bodyText1);
        return aLabel;
    }
    
    private JLabel cLabel()
    {
        JLabel aLabel = new JLabel("Log Base e:");
        aLabel.setForeground(ProjectGoldStarsCalculatorS.color2);
        aLabel.setFont(ProjectGoldStarsCalculatorS.bodyText1);
        return aLabel;
    }
    
    private void setupTF1()
    {
        tf1 = new JTextField("0");
        tf1.setFont(ProjectGoldStarsCalculatorS.bodyText2);
    }
    
    private void setupTF2()
    {
        tf2 = new JTextField("0");
        tf2.setEditable(false);
        tf2.setFont(ProjectGoldStarsCalculatorS.bodyText2);
    }
    
    private void setupTF3()
    {
        tf3 = new JTextField("0");
        tf3.setEditable(false);
        tf3.setFont(ProjectGoldStarsCalculatorS.bodyText2);
    }
    
    private class ComputeListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            double input = 0.0;
            try
            {
                String temp = tf1.getText();
                input = Double.parseDouble(temp);
            }
            catch(Exception e2)
            {
                JOptionPane.showMessageDialog(null, "ERROR", "Calculator", JOptionPane.ERROR_MESSAGE);
                return;
            }
            tf2.setText("" + Math.log10(input));
            tf3.setText("" + Math.log(input));
        }
    }
    
    @Override
    public void actionPerformed(ActionEvent e)
    {
        throw new UnsupportedOperationException("Error");
    }
}