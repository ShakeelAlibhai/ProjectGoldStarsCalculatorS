package projectgoldstarscalculators;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
public class CalcMultiply implements ActionListener
{
    public static JTextField tf1, tf2, tf3, tf4, tf5, tf6, tf7, tf8, tf9, tf10;
    
    public CalcMultiply()
    {
        multiply();
    }
    
    private void multiply()
    {
        JFrame additionFrame = new JFrame("Multiplication");
        additionFrame.getContentPane().setBackground(ProjectGoldStarsCalculatorS.color1);
        additionFrame.setLayout(new GridLayout(11, 2));
        additionFrame.setSize(750 * ProjectGoldStarsCalculatorS.multiplier, 375 * ProjectGoldStarsCalculatorS.multiplier);
        additionFrame.setIconImage(Icon.getImage());
        JLabel number1 = new JLabel("Number #1:");
        number1.setForeground(ProjectGoldStarsCalculatorS.color2);
        number1.setFont(ProjectGoldStarsCalculatorS.bodyText1);
        JLabel number2 = new JLabel("Number #2:");
        number2.setForeground(ProjectGoldStarsCalculatorS.color2);
        number2.setFont(ProjectGoldStarsCalculatorS.bodyText1);
        JLabel number3 = new JLabel("Number #3:");
        number3.setForeground(ProjectGoldStarsCalculatorS.color2);
        number3.setFont(ProjectGoldStarsCalculatorS.bodyText1);
        JLabel number4 = new JLabel("Number #4:");
        number4.setForeground(ProjectGoldStarsCalculatorS.color2);
        number4.setFont(ProjectGoldStarsCalculatorS.bodyText1);
        JLabel number5 = new JLabel("Number #5:");
        number5.setForeground(ProjectGoldStarsCalculatorS.color2);
        number5.setFont(ProjectGoldStarsCalculatorS.bodyText1);
        JLabel number6 = new JLabel("Number #6:");
        number6.setForeground(ProjectGoldStarsCalculatorS.color2);
        number6.setFont(ProjectGoldStarsCalculatorS.bodyText1);
        JLabel number7 = new JLabel("Number #7:");
        number7.setForeground(ProjectGoldStarsCalculatorS.color2);
        number7.setFont(ProjectGoldStarsCalculatorS.bodyText1);
        JLabel number8 = new JLabel("Number #8:");
        number8.setForeground(ProjectGoldStarsCalculatorS.color2);
        number8.setFont(ProjectGoldStarsCalculatorS.bodyText1);
        JLabel number9 = new JLabel("Number #9:");
        number9.setForeground(ProjectGoldStarsCalculatorS.color2);
        number9.setFont(ProjectGoldStarsCalculatorS.bodyText1);
        JLabel number10 = new JLabel("Number #10:");
        number10.setForeground(ProjectGoldStarsCalculatorS.color2);
        number10.setFont(ProjectGoldStarsCalculatorS.bodyText1);
        tf1 = new JTextField("0");
        tf1.setFont(ProjectGoldStarsCalculatorS.bodyText2);
        tf2 = new JTextField("0");
        tf2.setFont(ProjectGoldStarsCalculatorS.bodyText2);
        tf3 = new JTextField("0");
        tf3.setFont(ProjectGoldStarsCalculatorS.bodyText2);
        tf4 = new JTextField("0");
        tf4.setFont(ProjectGoldStarsCalculatorS.bodyText2);
        tf5 = new JTextField("0");
        tf5.setFont(ProjectGoldStarsCalculatorS.bodyText2);
        tf6 = new JTextField("0");
        tf6.setFont(ProjectGoldStarsCalculatorS.bodyText2);
        tf7 = new JTextField("0");
        tf7.setFont(ProjectGoldStarsCalculatorS.bodyText2);
        tf8 = new JTextField("0");
        tf8.setFont(ProjectGoldStarsCalculatorS.bodyText2);
        tf9 = new JTextField("0");
        tf9.setFont(ProjectGoldStarsCalculatorS.bodyText2);
        tf10 = new JTextField("0");
        tf10.setFont(ProjectGoldStarsCalculatorS.bodyText2);
        additionFrame.add(number1);
        additionFrame.add(tf1);
        additionFrame.add(number2);
        additionFrame.add(tf2);
        additionFrame.add(number3);
        additionFrame.add(tf3);
        additionFrame.add(number4);
        additionFrame.add(tf4);
        additionFrame.add(number5);
        additionFrame.add(tf5);
        additionFrame.add(number6);
        additionFrame.add(tf6);
        additionFrame.add(number7);
        additionFrame.add(tf7);
        additionFrame.add(number8);
        additionFrame.add(tf8);
        additionFrame.add(number9);
        additionFrame.add(tf9);
        additionFrame.add(number10);
        additionFrame.add(tf10);
        additionFrame.add(new JLabel());
        additionFrame.add(Components.button2("Multiply", new MultiplyListener()));
        additionFrame.setVisible(true);
    }
    
    private class MultiplyListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            String[] arrayOfStrings = new String[10];
            arrayOfStrings[0] = tf1.getText();
            arrayOfStrings[1] = tf2.getText();
            arrayOfStrings[2] = tf3.getText();
            arrayOfStrings[3] = tf4.getText();
            arrayOfStrings[4] = tf5.getText();
            arrayOfStrings[5] = tf6.getText();
            arrayOfStrings[6] = tf7.getText();
            arrayOfStrings[7] = tf8.getText();
            arrayOfStrings[8] = tf9.getText();
            arrayOfStrings[9] = tf10.getText();
            Double nums[] = new Double[10];
            for(int i = 0; i < nums.length; i++)
            {
                try
                {
                    nums[i] = Double.parseDouble(arrayOfStrings[i]);
                }
                catch(Exception e2)
                {
                    
                }
            }
            double sum = 1;
            for(int i = 0; i < nums.length; i++)
            {
                sum *= nums[i];
            }
            JOptionPane.showMessageDialog(null, sum, "Multiplication", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    @Override
    public void actionPerformed(ActionEvent e)
    {
        throw new UnsupportedOperationException("Error");
    }
}