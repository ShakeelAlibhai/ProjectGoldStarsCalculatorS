package projectgoldstarscalculators;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
public class CalcAdd implements ActionListener
{
    public static JTextField tf1, tf2, tf3, tf4, tf5, tf6, tf7, tf8, tf9, tf10;
    
    public CalcAdd()
    {
        add();
    }
    
    private void add()
    {
        ProgramWindow frame = new ProgramWindow("Addition");
        frame.setLayout(new GridLayout(11, 2));
        frame.setSize(750 * ProjectGoldStarsCalculatorS.multiplier, 400 * ProjectGoldStarsCalculatorS.multiplier);
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
        frame.add(Components.button2("Add", new AddListener()));
        frame.makeVisible();
    }
    
    private JMenuBar menuBar()
    {
        JMenuBar menuBar = new JMenuBar();
        menuBar.setBackground(ProjectGoldStarsCalculatorS.color1);
        menuBar.add(Components.standardButton("Add More Than 10 Numbers", new AddMoreThan10NumbersListener()));
        return menuBar;
    }
    
    private JLabel numberLabel(int number)
    {
        JLabel label = new JLabel("Number #" + number + ":");
        label.setForeground(ProjectGoldStarsCalculatorS.color2);
        label.setFont(ProjectGoldStarsCalculatorS.bodyText1);
        return label;
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
    
    private void setupTF3()
    {
        tf3 = new JTextField("0");
        tf3.setFont(ProjectGoldStarsCalculatorS.bodyText2);
    }
    
    private void setupTF4()
    {
        tf4 = new JTextField("0");
        tf4.setFont(ProjectGoldStarsCalculatorS.bodyText2);
    }
    
    private void setupTF5()
    {
        tf5 = new JTextField("0");
        tf5.setFont(ProjectGoldStarsCalculatorS.bodyText2);
    }
    
    private void setupTF6()
    {
        tf6 = new JTextField("0");
        tf6.setFont(ProjectGoldStarsCalculatorS.bodyText2);
    }
    
    private void setupTF7()
    {
        tf7 = new JTextField("0");
        tf7.setFont(ProjectGoldStarsCalculatorS.bodyText2);
    }
    
    private void setupTF8()
    {
        tf8 = new JTextField("0");
        tf8.setFont(ProjectGoldStarsCalculatorS.bodyText2);
    }
    
    private void setupTF9()
    {
        tf9 = new JTextField("0");
        tf9.setFont(ProjectGoldStarsCalculatorS.bodyText2);
    }
    
    private void setupTF10()
    {
        tf10 = new JTextField("0");
        tf10.setFont(ProjectGoldStarsCalculatorS.bodyText2);
    }
    
    private class AddListener implements ActionListener
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
            double sum = 0;
            for(int i = 0; i < nums.length; i++)
            {
                sum += nums[i];
            }
            JOptionPane.showMessageDialog(null, sum, "Addition", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    private class AddMoreThan10NumbersListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            String output;
            boolean continuePrompt = true;
            boolean firstPrompt = true;
            double sum = 0.0;
            double previousNumber = 0.0;
            double previousSum = 0.0;
            while(continuePrompt)
            {
                String displayText;
                if(firstPrompt)
                {
                    displayText = "Please enter the first number:";
                }
                else
                {
                    displayText = previousSum + " + " + previousNumber + " = " + sum + "\n"
                            + "Please enter the number to add to " + sum + " or enter X to quit.";
                }
                firstPrompt = false;
                output = JOptionPane.showInputDialog(null, displayText, "Addition", JOptionPane.QUESTION_MESSAGE);
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
                    JOptionPane.showMessageDialog(null, "ERROR", "Addition", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                previousSum = sum;
                previousNumber = input;
                sum += input;
            }
        }
    }
    
    @Override
    public void actionPerformed(ActionEvent e)
    {
        throw new UnsupportedOperationException("Error");
    }
}