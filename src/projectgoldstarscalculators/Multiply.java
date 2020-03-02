package projectgoldstarscalculators;
import components.ProgramWindow;
import components.Buttons;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
public class Multiply implements ActionListener
{
    private static JTextField tf1, tf2, tf3, tf4, tf5, tf6, tf7, tf8, tf9, tf10;
    
    public Multiply()
    {
        multiply();
    }
    
    private void multiply()
    {
        ProgramWindow frame = new ProgramWindow("Multiplication");
        frame.setLayout(new GridLayout(11, 2));
        frame.setSize(750 * Main.multiplier, 400 * Main.multiplier);
        frame.setJMenuBar(menuBar());
        frame.add(numberLabel(1));
        setupTF1();
        frame.add(tf1);
        frame.add(numberLabel(2));
        setupTF2();
        frame.add(tf2);
        frame.add(numberLabel(3));
        setupTF3();
        frame.add(tf3);
        frame.add(numberLabel(4));
        setupTF4();
        frame.add(tf4);
        frame.add(numberLabel(5));
        setupTF5();
        frame.add(tf5);
        frame.add(numberLabel(6));
        setupTF6();
        frame.add(tf6);
        frame.add(numberLabel(7));
        setupTF7();
        frame.add(tf7);
        frame.add(numberLabel(8));
        setupTF8();
        frame.add(tf8);
        frame.add(numberLabel(9));
        setupTF9();
        frame.add(tf9);
        frame.add(numberLabel(10));
        setupTF10();
        frame.add(tf10);
        frame.add(new JLabel());
        frame.add(Buttons.button2("Multiply", new MultiplyListener()));
        frame.makeVisible();
    }
    
    private JMenuBar menuBar()
    {
        JMenuBar menuBar = new JMenuBar();
        menuBar.setBackground(Main.mainColor);
        menuBar.add(Buttons.standardButton("Multiply More Than 10 Numbers", new MultiplyMoreThan10NumbersListener()));
        return menuBar;
    }
    
    private JLabel numberLabel(int number)
    {
        JLabel label = new JLabel("Number #" + number + ":");
        label.setForeground(Main.secondaryColor);
        label.setFont(Main.bodyText1);
        return label;
    }
    
    private void setupTF1()
    {
        tf1 = new JTextField("1");
        tf1.setFont(Main.bodyText2);
    }
    
    private void setupTF2()
    {
        tf2 = new JTextField("1");
        tf2.setFont(Main.bodyText2);
    }
    
    private void setupTF3()
    {
        tf3 = new JTextField("1");
        tf3.setFont(Main.bodyText2);
    }
    
    private void setupTF4()
    {
        tf4 = new JTextField("1");
        tf4.setFont(Main.bodyText2);
    }
    
    private void setupTF5()
    {
        tf5 = new JTextField("1");
        tf5.setFont(Main.bodyText2);
    }
    
    private void setupTF6()
    {
        tf6 = new JTextField("1");
        tf6.setFont(Main.bodyText2);
    }
    
    private void setupTF7()
    {
        tf7 = new JTextField("1");
        tf7.setFont(Main.bodyText2);
    }
    
    private void setupTF8()
    {
        tf8 = new JTextField("1");
        tf8.setFont(Main.bodyText2);
    }
    
    private void setupTF9()
    {
        tf9 = new JTextField("1");
        tf9.setFont(Main.bodyText2);
    }
    
    private void setupTF10()
    {
        tf10 = new JTextField("1");
        tf10.setFont(Main.bodyText2);
    }
    
    private class MultiplyListener implements ActionListener
    {
        @Override
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
    
    private class MultiplyMoreThan10NumbersListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            String output;
            boolean continuePrompt = true;
            boolean firstPrompt = true;
            double product = 1.0;
            double previousNumber = 0.0;
            double previousProduct = 1.0;
            while(continuePrompt)
            {
                String displayText;
                if(firstPrompt)
                {
                    displayText = "Please enter the first number:";
                }
                else
                {
                    displayText = previousProduct + " * " + previousNumber + " = " + product + "\n"
                            + "Please enter the number to multiply to " + product + " or enter X to quit.";
                }
                firstPrompt = false;
                output = JOptionPane.showInputDialog(null, displayText, "Multiplication", JOptionPane.QUESTION_MESSAGE);
                if(output == null || output.equals("x") || output.equals("X"))
                {
                    return;
                }
                double input;
                try
                {
                    input = Double.parseDouble(output);
                }
                catch(Exception error)
                {
                    JOptionPane.showMessageDialog(null, "ERROR", "Multiplication", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                previousProduct = product;
                previousNumber = input;
                product *= input;
            }
        }
    }
    
    @Override
    public void actionPerformed(ActionEvent e)
    {
        throw new UnsupportedOperationException("Error");
    }
}