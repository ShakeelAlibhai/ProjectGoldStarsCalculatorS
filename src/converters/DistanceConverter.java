package converters;
public class DistanceConverter
{
    public double toInches(String fromType, double fromValue)
    {
        double i = 0.0;
        
        if(!fromType.equals("Feet"))
        {
            fromValue = this.toFeet(fromType, fromValue);
        }
        
        //At this point, assume that fromValue is in feet
        
        i = fromValue * 12;
        
        return i;
    }
    
    public double toFeet(String fromType, double fromValue)
    {
        double f = 0.0;
        
        if(!fromType.equals("Inches"))
        {
            if(fromType.equals("Kilometers"))
            {
                fromValue = this.toMiles("Kilometers", fromValue);
            }

            //At this point, assume that fromValue is in miles

            f = fromValue * 5280;
        }
        else    //fromValue is in inches
        {
            f = fromValue / 12;
        }
        
        return f;
    }
    
    public double toMiles(String fromType, double fromValue)
    {
        double m = 0.0;
        
        switch(fromType)
        {
            case "Inches":
            {
                m = fromValue / 5280;
                m *= 12;
                break;
            }
            case "Feet":
            {
                m = fromValue / 5280;
                break;
            }
            case "Kilometers":
            {
                m = fromValue * 0.62137119;
                break;
            }
        }
        
        return m;
    }
    
    public double toKilometers(String fromType, double fromValue)
    {
        double k = 0.0;
        
        if(!fromType.equals("Miles"))
        {
            fromValue = this.toMiles(fromType, fromValue);
        }
        
        //At this point, assume that fromValue is in miles
        
        k = fromValue / 0.62137119;
        
        return k;
    }
}
