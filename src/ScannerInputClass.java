
//ScannerInputClass
/**
 * This code plays around with the Scanner Class to get input from the user
 * through the console window.
 * 
 * This program gets an integer userInt and a String userName from the user.
 * 
 *Teacher & PrimordialSalad
 * Sep 14, 2015 v2
 */

import java.util.Scanner;

public class ScannerInputClass
{
    public static void main (String [] args)
    {
        // Creates a new reference variable userInput of type Scanner. 
        // Assigns the reference variable userInput to a new Scanner object.     
        Scanner userInput = new Scanner(System.in);
              
        // Asks the user to input a number
        System.out.println("Input a number between 1 and 10");
        
        //  Assigns the primative interger variable userInt to the input from the console window.
        int userInt = userInput.nextInt();
        
        // Prints out the user's number.
        System.out.println("Your number is : " + userInt);
        
        // Asks the user to input their name.
        System.out.println("Input your name");
        
        // Assigns the String reference variable userName to the input from the console window.
        String userName = userInput.next();
        
        // Prints out the user's name.
        System.out.println("Your name is : " + userName);
        
        //Asks the user to input a temperature in Celsius.
        System.out.println("Input a temperature in Celsius");
        
        //Assigns the int variable userTemp to the input from the console window.
        int userTemp = userInput.nextInt();
        
        //Converts the user's input of Celsius to Fahrenheit.
        double fahrenheitTemp = userTemp * 1.8 + 32;
        
        System.out.println("The number in Fahrenheit is: " + fahrenheitTemp);
                
    }
        
}