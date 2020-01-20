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
public class Home extends JFrame
{
    public Home()
    {
        buildWindow();
    }
    
    private void buildWindow()
    {
        JFrame frame = new JFrame("Project GoldStars Calculator S");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1100 * Main.multiplier, 500 * Main.multiplier);
        frame.setExtendedState(frame.MAXIMIZED_BOTH);
        frame.setIconImage(Icon.getImage());
        frame.setLayout(new GridLayout(5, 5));
        frame.getContentPane().setBackground(Main.mainColor);
        frame.setJMenuBar(menuBar());
        frame.add(headerLabel("Basic Calculations:"));
        frame.add(action("Add", new Add2NumbersListener()));
        frame.add(action("Subtract", new Subtract2NumbersListener()));
        frame.add(action("Multiply", new Multiply2NumbersListener()));
        frame.add(action("Divide", new Divide2NumbersListener()));
        frame.add(headerLabel("Complex Calculations:"));
        frame.add(action("Square & Cube Roots", new SquareAndCubeRootsListener()));
        frame.add(action("Exponents", new ExponentsListener()));
        frame.add(action("Logarithms", new LogarithmsListener()));
        frame.add(action("Quadratic Equation Solver", new QuadraticEquationListener()));
        frame.add(headerLabel("Conversions:"));
        frame.add(action("Angle Conversions", new AngleConversionsListener()));
        frame.add(action("Distance Conversions", new DistanceConversionsListener()));
        frame.add(action("Temperature Conversions", new TemperatureConversionsListener()));
        frame.add(new JLabel());
        frame.add(headerLabel("Geometry:"));
        frame.add(action("Circles", new CirclesListener()));
        frame.add(action("Rectangles", new RectanglesListener()));
        frame.add(action("Triangles", new TrianglesListener()));
        frame.add(new JLabel());
        frame.add(headerLabel("Trigonometry:"));
        frame.add(action("Sine", new SineListener()));
        frame.add(action("Cosine", new CosineListener()));
        frame.add(action("Tangent", new TangentListener()));
        frame.setVisible(true);
    }
    
    private JMenu otherCalculatorsMenu()
    {
        JMenu otherCalculatorsMenu = new JMenu("Other Calculators");
        otherCalculatorsMenu.setBackground(Main.mainColor);
        otherCalculatorsMenu.setForeground(Main.secondaryColor);
        otherCalculatorsMenu.setFont(Main.mediumText1);
        otherCalculatorsMenu.add(standardMenuItem("Average Calculator", new AverageCalculatorListener()));
        otherCalculatorsMenu.add(standardMenuItem("Miles Per Gallon Calculator", new MilesPerGallonCalculatorListener()));
        otherCalculatorsMenu.add(standardMenuItem("Pythagorean Triple Finder", new PythagoreanTripleFinderListener()));
        return otherCalculatorsMenu;
    }
    
    private JMenuBar menuBar()
    {
        JMenuBar menuBar = new JMenuBar();
        menuBar.setBackground(Main.mainColor);
        menuBar.add(Components.standardButton("About", new AboutListener()));
        menuBar.add(Components.standardButton("Disclaimer", new DisclaimerListener()));
        menuBar.add(Components.standardButton("Themes", new ThemesListener()));
        menuBar.add(otherCalculatorsMenu());
        return menuBar;
    }
    
    private JMenuItem standardMenuItem(String displayText, ActionListener actionListener)
    {
        JMenuItem menuItem = new JMenuItem(displayText);
        menuItem.setFont(Main.mediumText3);
        menuItem.addActionListener(actionListener);
        return menuItem;
    }
    
    private JLabel headerLabel(String displayText)
    {
        JLabel titleLabel = new JLabel(displayText, SwingConstants.CENTER);
        titleLabel.setForeground(Main.secondaryColor);
        titleLabel.setFont(Main.mediumHeader);
        return titleLabel;
    }
    
    private JLabel action(String actionName, MouseListener mouseListener)
    {
        JLabel action = new JLabel(actionName, SwingConstants.CENTER);
        action.setForeground(Main.secondaryColor);
        action.setFont(Main.mediumText2);
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
    
    public static class ThemesListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            new Themes();
        }
    }
    
    public static class Add2NumbersListener implements MouseListener
    {
        public void mousePressed(MouseEvent e)
        {
            new Add();
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
            new Subtract();
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
            new Multiply();
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
            new Divide();
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
    
    public static class SquareAndCubeRootsListener implements MouseListener
    {
        public void mousePressed(MouseEvent e)
        {
            new SquareAndCubeRoots();
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
            new Exponents();
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
    
    public static class LogarithmsListener implements MouseListener
    {
        public void mousePressed(MouseEvent e)
        {
            new Logarithms();
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
            new QuadraticEquationSolver();
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
    
    public static class AngleConversionsListener implements MouseListener
    {
        public void mousePressed(MouseEvent e)
        {
            new AngleConversions();
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
    
    public static class DistanceConversionsListener implements MouseListener
    {
        public void mousePressed(MouseEvent e)
        {
            new DistanceConversions();
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
    
    public static class TemperatureConversionsListener implements MouseListener
    {
        public void mousePressed(MouseEvent e)
        {
            new TemperatureConversions();
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
    
    public static class CirclesListener implements MouseListener
    {
        public void mousePressed(MouseEvent e)
        {
            new Circles();
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
    
    public static class RectanglesListener implements MouseListener
    {
        public void mousePressed(MouseEvent e)
        {
            new Rectangles();
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
    
    public static class TrianglesListener implements MouseListener
    {
        public void mousePressed(MouseEvent e)
        {
            new Triangles();
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
            new Sine();
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
            new Cosine();
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
            new Tangent();
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
            new AverageCalculator();
        }
    }
    
    public static class MilesPerGallonCalculatorListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            new MilesPerGallonCalculator();
        }
    }
    
    public static class PythagoreanTripleFinderListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            new PythagoreanTripleFinder();
        }
    }
}