package projectgoldstarscalculators;
import components.Buttons;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.SwingConstants;
import listeners.HomeListeners;
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
        frame.add(action("Add", new HomeListeners.AddListener()));
        frame.add(action("Subtract", new HomeListeners.SubtractListener()));
        frame.add(action("Multiply", new HomeListeners.MultiplyListener()));
        frame.add(action("Divide", new HomeListeners.DivideListener()));
        frame.add(headerLabel("Complex Calculations:"));
        frame.add(action("Square & Cube Roots", new HomeListeners.SquareAndCubeRootsListener()));
        frame.add(action("Exponents", new HomeListeners.ExponentsListener()));
        frame.add(action("Logarithms", new HomeListeners.LogarithmsListener()));
        frame.add(action("Quadratic Equation Solver", new HomeListeners.QuadraticEquationListener()));
        frame.add(headerLabel("Conversions:"));
        frame.add(action("Angle Conversions", new HomeListeners.AngleConversionsListener()));
        frame.add(action("Distance Conversions", new HomeListeners.DistanceConversionsListener()));
        frame.add(action("Temperature Conversions", new HomeListeners.TemperatureConversionsListener()));
        frame.add(new JLabel());
        frame.add(headerLabel("Geometry:"));
        frame.add(action("Circles", new HomeListeners.CirclesListener()));
        frame.add(action("Rectangles", new HomeListeners.RectanglesListener()));
        frame.add(action("Triangles", new HomeListeners.TrianglesListener()));
        frame.add(new JLabel());
        frame.add(headerLabel("Trigonometry:"));
        frame.add(action("Sine", new HomeListeners.SineListener()));
        frame.add(action("Cosine", new HomeListeners.CosineListener()));
        frame.add(action("Tangent", new HomeListeners.TangentListener()));
        frame.setVisible(true);
    }
    
    private JMenu otherCalculatorsMenu()
    {
        JMenu otherCalculatorsMenu = new JMenu("Other Calculators");
        otherCalculatorsMenu.setBackground(Main.mainColor);
        otherCalculatorsMenu.setForeground(Main.secondaryColor);
        otherCalculatorsMenu.setFont(Main.mediumText1);
        otherCalculatorsMenu.add(standardMenuItem("Average Calculator", new HomeListeners.AverageCalculatorListener()));
        otherCalculatorsMenu.add(standardMenuItem("Miles Per Gallon Calculator", new HomeListeners.MilesPerGallonCalculatorListener()));
        otherCalculatorsMenu.add(standardMenuItem("Pythagorean Triple Finder", new HomeListeners.PythagoreanTripleFinderListener()));
        return otherCalculatorsMenu;
    }
    
    private JMenuBar menuBar()
    {
        JMenuBar menuBar = new JMenuBar();
        menuBar.setBackground(Main.mainColor);
        menuBar.add(Buttons.standardButton("About", new HomeListeners.AboutListener()));
        menuBar.add(Buttons.standardButton("Disclaimer", new HomeListeners.DisclaimerListener()));
        menuBar.add(Buttons.standardButton("Themes", new HomeListeners.ThemesListener()));
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
}