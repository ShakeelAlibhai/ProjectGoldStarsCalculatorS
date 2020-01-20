package converters;
public class DistanceConverter
{
    public double toFeet(String fromType, double fromValue)
    {
        double f = 0.0;
        
        if(fromType.equals("Kilometers"))
        {
            fromValue = this.toMiles("Kilometers", fromValue);
        }
        
        //At this point, assume that fromValue is in miles
        
        f = fromValue * 5280;
        
        return f;
    }
    
    public double toMiles(String fromType, double fromValue)
    {
        double m = 0.0;
        
        if(fromType.equals("Feet"))
        {
            m = fromValue / 5280;
        }
        
        if(fromType.equals("Kilometers"))
        {
            m = fromValue * 0.62137119;
        }
        
        return m;
    }
    
    public double toKilometers(String fromType, double fromValue)
    {
        double k = 0.0;
        
        if(fromType.equals("Feet"))
        {
            fromValue = this.toMiles("Feet", fromValue);
        }
        
        //At this point, assume that fromValue is in miles
        
        k = fromValue / 0.62137119;
        
        return k;
    }
}
