package components;
import java.awt.Font;
import javax.swing.JTextArea;
import projectgoldstarscalculators.Main;
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
        textArea.setBackground(Main.textBackgroundColor);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        if(Main.standardColors)
        {
            textArea.setForeground(Main.secondaryColor);
        }
        else
        {
            textArea.setForeground(Main.mainColor);
        }
        frame.add(textArea);
    }
}