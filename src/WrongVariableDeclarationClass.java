/**
 * This code is filled with improper variable declarations.
 * 
 * Please clean up this code and compile and run the proper code.
 * 
 * Teacher
 * Sep 29, 2015
 */
public class WrongVariableDeclarationClass
{
    public static void main (String[] args)
    {
        int width;
        width = 5;     
        int areaRectangle;
        int length = 7;
        areaRectangle = length * width;
        
        
        int radius = 2;              
        double numberForPi = 314/100;            
        double circleArea;
        
        circleArea = radius * radius * numberForPi;
        
        char letter1 = 'A';              
        char letter2 = 'P' ;
        String courseName ="Comp Sci";
        
            
        System.out.println ("This course is called " + letter1 + letter2 + " " + courseName);
        System.out.println ("The area of the rectangle is: " + areaRectangle);
        System.out.println ("The area of the circle is: " + circleArea);
    }
        
}