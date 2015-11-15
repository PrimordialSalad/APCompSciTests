import java.util.Scanner;
public class ToadTestDriver
{
    public static void main(String[] args)
    {
        Toad myToad = new Toad();
        Scanner userInput = new Scanner(System.in);
        
        System.out.println("What is your toad size?");
        myToad.setSize(userInput.nextInt());
        System.out.println("Your toad is: " + myToad.getSize() + " centimeters");
        
        System.out.println("How many warts does your toad have?");
        myToad.setWarts(userInput.nextInt());
        System.out.println("Your toad has: " + myToad.getWarts() + " warts");
    }
}