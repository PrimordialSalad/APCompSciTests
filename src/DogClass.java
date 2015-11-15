// DogClass
/**
 * DogClass is a simple class that is a defines the basic characters of a dog and the dog barks.
 * 
 * Data it knows (i.e. Instance Variables)
 * String breed:
 * String colour;
 * String name;
 * int size:
 * int age;
 * 
 * Stuff it can do (i.e. methods)
 * bark ();
 * 
 * Teacher
 * Sep 24, 2015
 */
public class DogClass
{
    // instance variables    
    String breed;
    String colour;
    String name;
    int size;
    int age;

    // Method called bark.  Provides a bark depending on its argument for the size of the dog.
   void bark (int dogSize)
    {
        // Prints out a bark depending on the size of the dog
                
        if (dogSize < 25)
        {
            System.out.println ("woof, woof");
        } else {
            System.out.println ("WOOF");
        }
        
    }
}