package projectgoldstarscalculators;
public class Disclaimer
{
    public Disclaimer()
    {
        disclaimer();
    }
    
    private void disclaimer()
    {
        InformationWindow disclaimerFrame = new InformationWindow("Disclaimer");
        disclaimerFrame.setSize(675 * Main.multiplier, 350 * Main.multiplier);
        String output = "1. Neither Project GoldStars Calculator S, nor the programmer(s) of Project GoldStars Calculator S, nor the distributor(s) "
                + "of Project GoldStars Calculator S, nor anyone or anything else that is involved with Project GoldStars Calculator S, "
                + "are responsible for any misinformation, any inaccuracy, any problems, or any harm, whether physical or otherwise, "
                + "caused by Project GoldStars Calculator S or as a result of using Project GoldStars Calculator S.\n"
                + "2. Calculations and conversions made in Project GoldStars Calculator S are not guaranteed to be accurate and/or exact.";
        disclaimerFrame.addText(Main.bodyText1, output);
        disclaimerFrame.makeVisible();
    }
}