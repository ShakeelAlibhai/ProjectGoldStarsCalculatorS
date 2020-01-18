package converters;
public class DistanceConverter
{
    public double toMiles(String fromType, double fromValue)
    {
        double m = 0.0;
        
        if(fromType.equals("Kilometers"))
        {
            m = fromValue * 0.62137119;
        }
        
        return m;
    }
    
    public double toKilometers(String fromType, double fromValue)
    {
        double k = 0.0;
        
        if(fromType.equals("Miles"))
        {
            k = fromValue / 0.62137119;
        }
        
        return k;
    }
}
