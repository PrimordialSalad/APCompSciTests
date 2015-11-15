public class CarTestDriver
{
    public static void main(String[] args)
    {
        Car car1 = new Car();
        Car car2 = new Car();
        Car car3  = new Car();
        
        car1.make = "Ferrari";
        car1.model = "TessaRosa";
        car1.year = 1987;
        
        car2.make = "Hyundai";
        car2.model = "Pony";
        car2.year = 1982;
        
        car3.make = "VW";
        car3.model = "GTI";
        car3.year = 1999;
        
        System.out.println("My " + car1.year + " " + car1.make + " " + car1.model + " sound like this: " + car1.engineSound(205));
        System.out.println("My " + car2.year + " " +car2.make + " " +car2.model + " sound like this: " + car2.engineSound(67));
        System.out.println("My " + car3.year + " " +car3.make + " " +car3.model + " sound like this: " + car3.engineSound(154));
    }
}