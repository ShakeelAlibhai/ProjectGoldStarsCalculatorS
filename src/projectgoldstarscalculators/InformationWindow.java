package projectgoldstarscalculators;
import java.awt.Font;
import javax.swing.JTextArea;
public class InformationWindow extends StandardWindow
{
    public InformationWindow(String title)
    {
        super(title);
    }
    
    public void addText(Font f, String s)
    {
        JTextArea textArea = new JTextArea(s);
        textArea.setEditable(false);
        textArea.setFont(f);
        textArea.setBackground(ProjectGoldStarsCalculatorS.textBackgroundColor);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        if(ProjectGoldStarsCalculatorS.standardColors)
        {
            textArea.setForeground(ProjectGoldStarsCalculatorS.secondaryColor);
        }
        else
        {
            textArea.setForeground(ProjectGoldStarsCalculatorS.mainColor);
        }
        frame.add(textArea);
    }
}