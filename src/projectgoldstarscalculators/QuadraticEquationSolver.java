package projectgoldstarscalculators;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
public class QuadraticEquationSolver implements ActionListener
{
    public static JTextField aField, bField, cField;
    
    public QuadraticEquationSolver()
    {
        quadraticEquation();
    }
    
    private void quadraticEquation()
    {
        ProgramWindow frame = new ProgramWindow("Quadratic Equation Solver");
        frame.setLayout(new GridLayout(4, 2));
        frame.setSize(750 * ProjectGoldStarsCalculatorS.multiplier, 400 * ProjectGoldStarsCalculatorS.multiplier);
        frame.setInstructionsMenuBar("Please enter the quadratic equation in the following form: ax^2 + bx + c = 0");
        frame.add(Components.standardLabel("a:"));
        setupAF();
        frame.add(aField);
        frame.add(Components.standardLabel("b:"));
        setupBF();
        frame.add(bField);
        frame.add(Components.standardLabel("c:"));
        setupCF();
        frame.add(cField);
        frame.add(new JLabel());
        frame.add(Components.button2("Solve", new SolveQuadraticEquationListener()));
        frame.makeVisible();
    }
    
    private void setupAF()
    {
        aField = new JTextField("0");
        aField.setFont(ProjectGoldStarsCalculatorS.bodyText2);
    }
    
    private void setupBF()
    {
        bField = new JTextField("0");
        bField.setFont(ProjectGoldStarsCalculatorS.bodyText2);
    }
    
    private void setupCF()
    {
        cField = new JTextField("0");
        cField.setFont(ProjectGoldStarsCalculatorS.bodyText2);
    }
    
    public static class SolveQuadraticEquationListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            String a, b, c, output;
            a = aField.getText();
            b = bField.getText();
            c = cField.getText();
            Double aNum, bNum, cNum;
            try
            {
                aNum = Double.parseDouble(a);
            }
            catch(Exception e2)
            {
                return;
            }
            try
            {
                bNum = Double.parseDouble(b);
            }
            catch(Exception e2)
            {
                return;
            }
            try
            {
                cNum = Double.parseDouble(c);
            }
            catch(Exception e2)
            {
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
            if(x1 == x2)
            {
                output = "Solving the quadratic equation " + a + "x^2 + " + b + "x + " + c + " = 0...\n"
                        + "There is 1 possible solution: " + x1;
                JOptionPane.showMessageDialog(null, output, "Quadratic Equation", JOptionPane.INFORMATION_MESSAGE);
            }
            else
            {
                output = "Solving the quadratic equation " + a + "x^2 + " + b + "x + " + c + " = 0...\n"
                        + "There are 2 possible solutions: " + x1 + " and " + x2;
                JOptionPane.showMessageDialog(null, output, "Quadratic Equation", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }
    
    @Override
    public void actionPerformed(ActionEvent e)
    {
        throw new UnsupportedOperationException("Error");
    }
}