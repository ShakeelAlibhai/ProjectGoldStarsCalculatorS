package converters;
public class VolumeConverter
{
    public double toGallons(String fromType, double fromValue)
    {
        double g = 0.0;
        
        if(fromType.equals("Liters"))
        {
            g = fromValue * 0.26417;
        }
        
        return g;
    }
    
    public double toLiters(String fromType, double fromValue)
    {
        double l = 0.0;
        
        if(fromType.equals("Gallons"))
        {
            l = fromValue / 0.26417;
        }
        
        return l;
    }
}
