package projectgoldstarscalculators;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
public class QuadraticEquationSolver implements ActionListener
{
    public static JTextField af, bf, cf;
    
    public QuadraticEquationSolver()
    {
        quadraticEquation();
    }
    
    private void quadraticEquation()
    {
        ProgramWindow qeFrame = new ProgramWindow("Quadratic Equation Solver");
        qeFrame.setLayout(new GridLayout(4, 2));
        qeFrame.setSize(750 * ProjectGoldStarsCalculatorS.multiplier, 400 * ProjectGoldStarsCalculatorS.multiplier);
        qeFrame.setInstructionsMenuBar("Please enter the quadratic equation in the following form: ax^2 + bx + c");
        JLabel aLabel = new JLabel("a:");
        aLabel.setFont(ProjectGoldStarsCalculatorS.bodyText1);
        aLabel.setForeground(ProjectGoldStarsCalculatorS.color2);
        JLabel bLabel = new JLabel("b:");
        bLabel.setFont(ProjectGoldStarsCalculatorS.bodyText1);
        bLabel.setForeground(ProjectGoldStarsCalculatorS.color2);
        JLabel cLabel = new JLabel("c:");
        cLabel.setFont(ProjectGoldStarsCalculatorS.bodyText1);
        cLabel.setForeground(ProjectGoldStarsCalculatorS.color2);
        af = new JTextField("0");
        af.setFont(ProjectGoldStarsCalculatorS.bodyText2);
        bf = new JTextField("0");
        bf.setFont(ProjectGoldStarsCalculatorS.bodyText2);
        cf = new JTextField("0");
        cf.setFont(ProjectGoldStarsCalculatorS.bodyText2);
        qeFrame.add(aLabel);
        qeFrame.add(af);
        qeFrame.add(bLabel);
        qeFrame.add(bf);
        qeFrame.add(cLabel);
        qeFrame.add(cf);
        qeFrame.add(new JLabel());
        qeFrame.add(Components.button2("Solve", new SolveQuadraticEquationListener()));
        qeFrame.makeVisible();
    }
    
    public static class SolveQuadraticEquationListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            String a, b, c, output;
            a = af.getText();
            b = bf.getText();
            c = cf.getText();
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