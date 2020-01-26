package components;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import javax.swing.JButton;
public abstract class Button
{
    private JButton button;
    
    public Button(String text, ActionListener listener, Color background, Color foreground, Font font)
    {
        button = new JButton(text);
        button.setBackground(background);
        button.setForeground(foreground);
        button.setFont(font);
        button.addActionListener(listener);
    }
    
    JButton getButton()
    {
        return button;
    }
}