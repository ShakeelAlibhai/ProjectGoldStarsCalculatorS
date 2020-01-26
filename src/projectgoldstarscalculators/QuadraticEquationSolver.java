package projectgoldstarscalculators;
import components.ProgramWindow;
import components.Buttons;
import components.Labels;
import components.ResultField;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
public class QuadraticEquationSolver implements ActionListener
{
    private static JTextField aField, bField, cField;
    private static ResultField rf;
    
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
        frame.add(Labels.standardLabel("a:"));
        setupAField();
        frame.add(aField);
        frame.add(Labels.standardLabel("b:"));
        setupBField();
        frame.add(bField);
        frame.add(Labels.standardLabel("c:"));
        setupCField();
        frame.add(cField);
        frame.add(new JLabel());
        frame.add(Buttons.button2("Solve", new SolveQuadraticEquationListener()));
        frame.add(Labels.standardLabel("Solution(s):"));
        rf = new ResultField();
        frame.add(rf);
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
        public void actionPerformed(ActionEvent e)
        {
            String a, b, c;
            
            //Get the values of aField, bField, and CField and store them in Strings a, b, and c, respectively
            a = aField.getText();
            b = bField.getText();
            c = cField.getText();
            
            //Attempt to convert Strings a, b, and c to doubles and store them in aNum, bNum, and cNum, respectively
            double aNum, bNum, cNum;
            try
            {
                aNum = Double.parseDouble(a);
            }
            catch(Exception e2)
            {
                JOptionPane.showMessageDialog(null, "ERROR", "Quadratic Equation Solver", JOptionPane.ERROR_MESSAGE);
                return;
            }
            try
            {
                bNum = Double.parseDouble(b);
            }
            catch(Exception e2)
            {
                JOptionPane.showMessageDialog(null, "ERROR", "Quadratic Equation Solver", JOptionPane.ERROR_MESSAGE);
                return;
            }
            try
            {
                cNum = Double.parseDouble(c);
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
                rf.updateText("There is 1 possible solution: " + x1);
            }
            else
            {
                rf.updateText("There are 2 possible solutions: " + x1 + " and " + x2);
            }
        }
    }
    
    @Override
    public void actionPerformed(ActionEvent e)
    {
        throw new UnsupportedOperationException("Error");
    }
}