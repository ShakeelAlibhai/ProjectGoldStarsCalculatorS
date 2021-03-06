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
public class QuadraticEquationSolver implements ActionListener
{
    private static JTextField aField, bField, cField;
    private static ResultField resultField;
    
    public QuadraticEquationSolver()
    {
        quadraticEquation();
    }
    
    private void quadraticEquation()
    {
        ProgramWindow frame = new ProgramWindow("Quadratic Equation Solver");
        frame.setLayout(new GridLayout(5, 2));
        frame.setSize(750 * Main.multiplier, 400 * Main.multiplier);
        frame.setInstructionsMenuBar("Please enter a quadratic equation in the following form: ax^2 + bx + c = 0");
        frame.add(new StandardLabel("a:"));
        setupAField();
        frame.add(aField);
        frame.add(new StandardLabel("b:"));
        setupBField();
        frame.add(bField);
        frame.add(new StandardLabel("c:"));
        setupCField();
        frame.add(cField);
        frame.add(new JLabel());
        frame.add(Buttons.button2("Solve", new SolveQuadraticEquationListener()));
        frame.add(new StandardLabel("Solution(s):"));
        resultField = new ResultField();
        frame.add(resultField);
        frame.makeVisible();
    }
    
    private void setupAField()
    {
        aField = new JTextField("0");
        aField.setFont(Main.bodyText2);
        aField.addActionListener(new SolveQuadraticEquationListener());
    }
    
    private void setupBField()
    {
        bField = new JTextField("0");
        bField.setFont(Main.bodyText2);
        bField.addActionListener(new SolveQuadraticEquationListener());
    }
    
    private void setupCField()
    {
        cField = new JTextField("0");
        cField.setFont(Main.bodyText2);
        cField.addActionListener(new SolveQuadraticEquationListener());
    }
    
    public static class SolveQuadraticEquationListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            double aNum, bNum, cNum;
            
            try
            {
                aNum = Double.parseDouble(aField.getText());
            }
            catch(Exception e2)
            {
                JOptionPane.showMessageDialog(null, "ERROR", "Quadratic Equation Solver", JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            try
            {
                bNum = Double.parseDouble(bField.getText());
            }
            catch(Exception e2)
            {
                JOptionPane.showMessageDialog(null, "ERROR", "Quadratic Equation Solver", JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            try
            {
                cNum = Double.parseDouble(cField.getText());
            }
            catch(Exception e2)
            {
                JOptionPane.showMessageDialog(null, "ERROR", "Quadratic Equation Solver", JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            double x1, x2, quadSqrt;
            quadSqrt = bNum * bNum;
            quadSqrt = quadSqrt - (4 * aNum * cNum);
            quadSqrt = Math.sqrt(quadSqrt);
            x1 = (-1) * bNum;
            x2 = (-1) * bNum;
            x1 = x1 + quadSqrt;
            x2 = x2 - quadSqrt;
            x1 = x1 / (2 * aNum);
            x2 = x2 / (2 * aNum);
            
            if(x1 == x2)    //If there is one unique solution
            {
                resultField.updateText("There is 1 possible solution: " + x1);
            }
            else
            {
                resultField.updateText("There are 2 possible solutions: " + x1 + " and " + x2);
            }
        }
    }
    
    @Override
    public void actionPerformed(ActionEvent e)
    {
        throw new UnsupportedOperationException("Error");
    }
}