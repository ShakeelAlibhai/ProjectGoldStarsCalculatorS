package projectgoldstarscalculators;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.SwingConstants;
public class Window extends JFrame
{
    public Window()
    {
        buildWindow();
    }
    
    private void buildWindow()
    {
        JFrame frame = new JFrame("Project GoldStars Calculator S");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1100 * ProjectGoldStarsCalculatorS.multiplier, 500 * ProjectGoldStarsCalculatorS.multiplier);
        frame.setExtendedState(frame.MAXIMIZED_BOTH);
        frame.setIconImage(Icon.getImage());
        frame.setLayout(new GridLayout(5, 5));
        frame.getContentPane().setBackground(ProjectGoldStarsCalculatorS.color1);
        frame.setJMenuBar(menuBar());
        frame.add(headerLabel("Basic Calculations:"));
        frame.add(action("Add", new Add2NumbersListener()));
        frame.add(action("Subtract", new Subtract2NumbersListener()));
        frame.add(action("Multiply", new Multiply2NumbersListener()));
        frame.add(action("Divide", new Divide2NumbersListener()));
        frame.add(headerLabel("Complex Calculations:"));
        frame.add(action("Square Root", new SquareRootListener()));
        frame.add(action("Cube Root", new CubeRootListener()));
        frame.add(action("Exponents", new ExponentsListener()));
        frame.add(action("Quadratic Equation Solver", new QuadraticEquationListener()));
        frame.add(new JLabel());
        frame.add(action("Log Base 10", new LogBase10Listener()));
        frame.add(action("Natural Log", new NaturalLogListener()));
        frame.add(new JLabel());
        frame.add(new JLabel());
        frame.add(headerLabel("Conversions:"));
        frame.add(action("Celsius to Fahrenheit", new CelsiusToFahrenheitListener()));
        frame.add(action("Fahrenheit to Celsius", new FahrenheitToCelsiusListener()));
        frame.add(action("Degrees to Radians", new DegreesToRadiansListener()));
        frame.add(action("Radians to Degrees", new RadiansToDegreesListener()));
        frame.add(headerLabel("Trigonometry:"));
        frame.add(action("Sine", new SineListener()));
        frame.add(action("Cosine", new CosineListener()));
        frame.add(action("Tangent", new TangentListener()));
        frame.setVisible(true);
    }
    
    private JMenu otherCalculatorsMenu()
    {
        JMenu otherCalculatorsMenu = new JMenu("Other Calculators");
        otherCalculatorsMenu.setBackground(ProjectGoldStarsCalculatorS.color1);
        otherCalculatorsMenu.setForeground(ProjectGoldStarsCalculatorS.color2);
        otherCalculatorsMenu.setFont(ProjectGoldStarsCalculatorS.mediumText1);
        otherCalculatorsMenu.add(standardMenuItem("Average Calculator", new AverageCalculatorListener()));
        otherCalculatorsMenu.add(standardMenuItem("Miles Per Gallon Calculator", new MilesPerGallonCalculatorListener()));
        otherCalculatorsMenu.add(standardMenuItem("Pythagorean Triple Finder", new PythagoreanTripleFinderListener()));
        otherCalculatorsMenu.add(standardMenuItem("Rectangle Information Calculator", new RectangleInformationCalculatorListener()));
        return otherCalculatorsMenu;
    }
    
    private JMenuBar menuBar()
    {
        JMenuBar menuBar = new JMenuBar();
        menuBar.setBackground(ProjectGoldStarsCalculatorS.color1);
        menuBar.add(Components.standardButton("About", new AboutListener()));
        menuBar.add(Components.standardButton("Disclaimer", new DisclaimerListener()));
        menuBar.add(otherCalculatorsMenu());
        return menuBar;
    }
    
    private JMenuItem standardMenuItem(String displayText, ActionListener actionListener)
    {
        JMenuItem menuItem = new JMenuItem(displayText);
        menuItem.setFont(ProjectGoldStarsCalculatorS.mediumText3);
        menuItem.addActionListener(actionListener);
        return menuItem;
    }
    
    private JLabel headerLabel(String displayText)
    {
        JLabel titleLabel = new JLabel(displayText, SwingConstants.CENTER);
        titleLabel.setForeground(ProjectGoldStarsCalculatorS.color2);
        titleLabel.setFont(ProjectGoldStarsCalculatorS.mediumHeader);
        return titleLabel;
    }
    
    private JLabel action(String actionName, MouseListener mouseListener)
    {
        JLabel action = new JLabel(actionName, SwingConstants.CENTER);
        action.setForeground(ProjectGoldStarsCalculatorS.color2);
        action.setFont(ProjectGoldStarsCalculatorS.mediumText2);
        action.addMouseListener(mouseListener);
        return action;
    }
    
    public static class AboutListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            new About();
        }
    }
    
    public static class DisclaimerListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            new Disclaimer();
        }
    }
    
    public static class Add2NumbersListener implements MouseListener
    {
        public void mousePressed(MouseEvent e)
        {
            new CalcAdd();
        }

        @Override
        public void mouseClicked(MouseEvent e)
        {
            
        }

        @Override
        public void mouseReleased(MouseEvent e)
        {
            
        }

        @Override
        public void mouseEntered(MouseEvent e)
        {
            
        }

        @Override
        public void mouseExited(MouseEvent e)
        {
            
        }
    }
    
    public static class Subtract2NumbersListener implements MouseListener
    {
        public void mousePressed(MouseEvent e)
        {
            new CalcSubtract();
        }

        @Override
        public void mouseClicked(MouseEvent e)
        {
            
        }

        @Override
        public void mouseReleased(MouseEvent e)
        {
            
        }

        @Override
        public void mouseEntered(MouseEvent e)
        {
            
        }

        @Override
        public void mouseExited(MouseEvent e)
        {
            
        }
    }
    
    public static class Multiply2NumbersListener implements MouseListener
    {
        public void mousePressed(MouseEvent e)
        {
            new CalcMultiply();
        }

        @Override
        public void mouseClicked(MouseEvent e)
        {
            
        }

        @Override
        public void mouseReleased(MouseEvent e)
        {
            
        }

        @Override
        public void mouseEntered(MouseEvent e)
        {
            
        }

        @Override
        public void mouseExited(MouseEvent e)
        {
            
        }
    }
    
    public static class Divide2NumbersListener implements MouseListener
    {
        public void mousePressed(MouseEvent e)
        {
            new CalcDivide();
        }

        @Override
        public void mouseClicked(MouseEvent e)
        {
            
        }

        @Override
        public void mouseReleased(MouseEvent e)
        {
            
        }

        @Override
        public void mouseEntered(MouseEvent e)
        {
            
        }

        @Override
        public void mouseExited(MouseEvent e)
        {
            
        }
    }
    
    public static class SquareRootListener implements MouseListener
    {
        public void mousePressed(MouseEvent e)
        {
            new CalcSquareRoot();
        }

        @Override
        public void mouseClicked(MouseEvent e)
        {
            
        }

        @Override
        public void mouseReleased(MouseEvent e)
        {
            
        }

        @Override
        public void mouseEntered(MouseEvent e)
        {
            
        }

        @Override
        public void mouseExited(MouseEvent e)
        {
            
        }
    }
    
    public static class CubeRootListener implements MouseListener
    {
        public void mousePressed(MouseEvent e)
        {
            new CalcCubeRoot();
        }

        @Override
        public void mouseClicked(MouseEvent e)
        {
            
        }

        @Override
        public void mouseReleased(MouseEvent e)
        {
            
        }

        @Override
        public void mouseEntered(MouseEvent e)
        {
            
        }

        @Override
        public void mouseExited(MouseEvent e)
        {
            
        }
    }
    
    public static class ExponentsListener implements MouseListener
    {
        public void mousePressed(MouseEvent e)
        {
            new CalcExponents();
        }

        @Override
        public void mouseClicked(MouseEvent e)
        {
            
        }

        @Override
        public void mouseReleased(MouseEvent e)
        {
            
        }

        @Override
        public void mouseEntered(MouseEvent e)
        {
            
        }

        @Override
        public void mouseExited(MouseEvent e)
        {
            
        }
    }
    
    public static class QuadraticEquationListener implements MouseListener
    {
        public void mousePressed(MouseEvent e)
        {
            new CalcQuadraticEquation();
        }

        @Override
        public void mouseClicked(MouseEvent e)
        {
            
        }

        @Override
        public void mouseReleased(MouseEvent e)
        {
            
        }

        @Override
        public void mouseEntered(MouseEvent e)
        {
            
        }

        @Override
        public void mouseExited(MouseEvent e)
        {
            
        }
    }
    
    public static class DegreesToRadiansListener implements MouseListener
    {
        public void mousePressed(MouseEvent e)
        {
            new CalcDegreesToRadians();
        }

        @Override
        public void mouseClicked(MouseEvent e)
        {
            
        }

        @Override
        public void mouseReleased(MouseEvent e)
        {
            
        }

        @Override
        public void mouseEntered(MouseEvent e)
        {
            
        }

        @Override
        public void mouseExited(MouseEvent e)
        {
            
        }
    }
    
    public static class RadiansToDegreesListener implements MouseListener
    {
        public void mousePressed(MouseEvent e)
        {
            new CalcRadiansToDegrees();
        }

        @Override
        public void mouseClicked(MouseEvent e)
        {
            
        }

        @Override
        public void mouseReleased(MouseEvent e)
        {
            
        }

        @Override
        public void mouseEntered(MouseEvent e)
        {
            
        }

        @Override
        public void mouseExited(MouseEvent e)
        {
            
        }
    }
    
    public static class LogBase10Listener implements MouseListener
    {
        public void mousePressed(MouseEvent e)
        {
            new CalcLogBase10();
        }

        @Override
        public void mouseClicked(MouseEvent e)
        {
            
        }

        @Override
        public void mouseReleased(MouseEvent e)
        {
            
        }

        @Override
        public void mouseEntered(MouseEvent e)
        {
            
        }

        @Override
        public void mouseExited(MouseEvent e)
        {
            
        }
    }
    
    public static class NaturalLogListener implements MouseListener
    {
        public void mousePressed(MouseEvent e)
        {
            new CalcNaturalLog();
        }

        @Override
        public void mouseClicked(MouseEvent e)
        {
            
        }

        @Override
        public void mouseReleased(MouseEvent e)
        {
            
        }

        @Override
        public void mouseEntered(MouseEvent e)
        {
            
        }

        @Override
        public void mouseExited(MouseEvent e)
        {
            
        }
    }
    
    public static class CelsiusToFahrenheitListener implements MouseListener
    {
        public void mousePressed(MouseEvent e)
        {
            new CalcCelsiusToFahrenheit();
        }

        @Override
        public void mouseClicked(MouseEvent e)
        {
            
        }

        @Override
        public void mouseReleased(MouseEvent e)
        {
            
        }

        @Override
        public void mouseEntered(MouseEvent e)
        {
            
        }

        @Override
        public void mouseExited(MouseEvent e)
        {
            
        }
    }
    
    public static class FahrenheitToCelsiusListener implements MouseListener
    {
        public void mousePressed(MouseEvent e)
        {
            new CalcFahrenheitToCelsius();
        }

        @Override
        public void mouseClicked(MouseEvent e)
        {
            
        }

        @Override
        public void mouseReleased(MouseEvent e)
        {
            
        }

        @Override
        public void mouseEntered(MouseEvent e)
        {
            
        }

        @Override
        public void mouseExited(MouseEvent e)
        {
            
        }
    }
    
    public static class SineListener implements MouseListener
    {
        public void mousePressed(MouseEvent e)
        {
            new CalcSine();
        }

        @Override
        public void mouseClicked(MouseEvent e)
        {
            
        }

        @Override
        public void mouseReleased(MouseEvent e)
        {
            
        }

        @Override
        public void mouseEntered(MouseEvent e)
        {
            
        }

        @Override
        public void mouseExited(MouseEvent e)
        {
            
        }
    }
    
    public static class CosineListener implements MouseListener
    {
        public void mousePressed(MouseEvent e)
        {
            new CalcCosine();
        }

        @Override
        public void mouseClicked(MouseEvent e)
        {
            
        }

        @Override
        public void mouseReleased(MouseEvent e)
        {
            
        }

        @Override
        public void mouseEntered(MouseEvent e)
        {
            
        }

        @Override
        public void mouseExited(MouseEvent e)
        {
            
        }
    }
    
    public static class TangentListener implements MouseListener
    {
        public void mousePressed(MouseEvent e)
        {
            new CalcTangent();
        }

        @Override
        public void mouseClicked(MouseEvent e)
        {
            
        }

        @Override
        public void mouseReleased(MouseEvent e)
        {
            
        }

        @Override
        public void mouseEntered(MouseEvent e)
        {
            
        }

        @Override
        public void mouseExited(MouseEvent e)
        {
            
        }
    }
    
    public static class AverageCalculatorListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            new CalcAverage();
        }
    }
    
    public static class MilesPerGallonCalculatorListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            new CalcMilesPerGallon();
        }
    }
    
    public static class PythagoreanTripleFinderListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            new CalcPythagoreanTripleFinder();
        }
    }
    
    public static class RectangleInformationCalculatorListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            new CalcRectangleInformation();
        }
    }
}