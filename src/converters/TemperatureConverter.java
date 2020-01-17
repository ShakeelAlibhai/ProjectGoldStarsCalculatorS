package converters;
public class TemperatureConverter
{
    public double toCelsius(String fromType, double fromValue)
    {
        double c = 0.0;
        
        if(fromType.equals("Fahrenheit"))
        {
            c = fromValue - 32;
            c *= 5;
            c /= 9;
        }
        
        
        else
        {
            c = fromValue - 273.15;
        }
        
        return c;
    }
    
    public double toFahrenheit(String fromType, double fromValue)
    {
        double f = 0.0;
        
        if(fromType.equals("Kelvin"))
        {
            fromValue = this.toCelsius("Kelvin", fromValue);
        }
        
        //At this point, assume that fromValue is in Celsius
        
        f = fromValue * 9;
        f /= 5;
        f += 32;
        
        return f;
    }
    
    public double toKelvin(String fromType, double fromValue)
    {
        double k = 0.0;
        
        if(fromType.equals("Fahrenheit"))
        {
            fromValue = this.toCelsius("Fahrenheit", fromValue);
        }
        
        //At this point, assume that fromValue is in Celsius
        
        k = fromValue + 273.15;
        
        return k;
    }
}
