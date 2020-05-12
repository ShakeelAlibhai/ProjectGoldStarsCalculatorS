package converters;
public class VolumeConverter
{
    public double toCubicMeters(String fromType, double fromValue)
    {
        double c = 0.0;
        
        if(!fromType.equals("Liters"))
        {
            fromValue = this.toLiters(fromType, fromValue);
        }
        
        //At this point, assume that fromValue is in liters
        
        c = fromValue / 1000;
        
        return c;
    }
    
    public double toGallons(String fromType, double fromValue)
    {
        double g = 0.0;
        
        if(fromType.equals("Liters"))
        {
            g = fromValue * 0.26417;
        }
        
        if(fromType.equals("Cubic Meters"))
        {
            g = fromValue * 0.26417;
            g *= 1000;
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
        
        if(fromType.equals("Cubic Meters"))
        {
            l = fromValue * 1000;
        }
        
        return l;
    }
}
