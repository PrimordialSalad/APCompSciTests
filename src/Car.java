public class Car//A test from the review for APCS on Oct 15 2015.
{
    String make;
    String model;
    int year;
    
    public String engineSound(int horsePower)
    {
        if ((0<= horsePower) && (100 >= horsePower))
        {
            return "zip, zip";
        }
        else if((101 <= horsePower) && (200 >= horsePower)) 
        {
            return "zoom, zoom";
        }
        else
        {
            return "ZOOM, ZOOM";
        }
    }
}