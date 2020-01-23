package components;
import javax.swing.JTextField;
import projectgoldstarscalculators.Main;
public class ResultField
{
    private JTextField rf;
    
    public ResultField()
    {
        rf = new JTextField("0");
        rf.setEditable(false);
        rf.setFont(Main.bodyText2);
    }
    
    public void updateText(String newText)
    {
        rf.setText(newText);
    }
    
    //Package protected - ProgramWindow uses this method
    JTextField getResultField()
    {
        return rf;
    }
}