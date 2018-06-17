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
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        frame.add(textArea);
    }
}