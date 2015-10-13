// DogTestDriver
/**
 * This class tests the DogClass
 * It creates two DogClass objects.
 * It call the DogClass bark() method.
 * 
 * Teacher
 * Sep 24, 2015
 */
public class DogTestDriver
{
    public static void main (String [] args)
    {
        DogClass myDog1 = new DogClass();
        DogClass myDog2 = new DogClass();
        DogClass myDog3 = new DogClass();
        
        myDog1.breed = "Lab-Collie";
        myDog1.colour = "black";
        myDog1.name = "Violet";
        myDog1.size = 45;
        myDog1.age = 6;
        
        myDog2.breed = "Schnauzer";
        myDog2.colour = "black and white";
        myDog2.name = "Louie";
        myDog2.size = 15;
        myDog2.age = 6;
        
        myDog3.breed = "Retriever";
        myDog3.colour = "golden";
        myDog3.name = "Oscar";
        myDog3.size = 40;
        myDog3.age = 10;
        
        System.out.println("My dog " + myDog1.name + " barks like this: ");
        myDog1.bark(myDog1.size);
        
        System.out.println("My dog " + myDog2.name + " barks like this: ");
        myDog2.bark(myDog2.size);
        
        System.out.println("My dog " + myDog3.name + " barks like this: ");
        myDog3.bark(myDog3.size);
    }  
}