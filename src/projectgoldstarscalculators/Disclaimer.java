package projectgoldstarscalculators;
import javax.swing.JOptionPane;
public class Disclaimer
{
    public Disclaimer()
    {
        disclaimer();
    }
    
    private void disclaimer()
    {
        String output = "Neither Project GoldStars Calculator S, nor the programmer(s) of Project GoldStars Calculator S, nor the distributor(s) of Project GoldStars Calculator S,\n"
                + "nor anyone or anything else that is involved with Project GoldStars Calculator S, are responsible for any misinformation, any inaccuracy,\n"
                + "any problems, or any harm, whether physical or otherwise, caused by Project GoldStars Calculator S or as a result of using Project GoldStars Calculator S.\n"
                + "Calculations and conversions made in Project GoldStars Calculator S are not guaranteed to be accurate.";
        JOptionPane.showMessageDialog(null, output, "Disclaimer", JOptionPane.INFORMATION_MESSAGE);
    }
}