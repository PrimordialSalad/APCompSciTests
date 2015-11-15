import java.util.Scanner;
public class DistanceCalc
{
    public static void main(String[] args)
    {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Input Velocity");
        double v = userInput.nextDouble();
        System.out.println("Input Acceleration");
        double a = userInput.nextDouble();
        System.out.println("Input Time");
        double t = userInput.nextDouble();
        double d = (v*t) + (0.5*a*t*t);
        System.out.println("d = " + d);
    }
}