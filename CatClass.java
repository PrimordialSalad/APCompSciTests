/** CatClass is a simple class that defines the basic characters of a cat and the cat meows.
 * 
 * Stuff it can do(methods)
 * meow()
 * 
 * PrimordialSalad
 * Sep 27 2015
 */
public class CatClass
{
    String temperance;
    String colour;
    String name;
    int size;
    int age;
    
    void meow(int catAge)
    {
        if (catAge < 10)
        {
            System.out.println("Mew");
        }
        else
        {
            System.out.println("Meowwww!");
        }
    }
    void purr(int catSize)
    {
        if (catSize <= 9)
        {
            System.out.println("purr");
        }
        else
        {
            System.out.println("PURRR!!!");
        }
    }
}