public class CatTestDriver
{
    public static void main(String[] args)
    {
        CatClass myCat1 = new CatClass();
        CatClass myCat2 = new CatClass();
        
        myCat1.temperance = "playful";
        myCat1.colour = "black and white";
        myCat1.name = "April";
        myCat1.size = 12;
        myCat1.age = 7;
        
        myCat2.temperance = "vicious";
        myCat2.colour = "black and grey";
        myCat2.name = "Jasper";
        myCat2.size = 9;
        myCat2.age = 14;
        
        System.out.println ("My cat " + myCat1.name + " meows like this: ");
        myCat1.meow(myCat1.age);
        System.out.println("My cat " + myCat1.name + " purrs like this: ");
        myCat1.purr(myCat1.size);
        
        System.out.println("My cat " + myCat2.name + " meows like this: ");
        myCat2.meow(myCat2.age);
        System.out.println("My cat " + myCat2.name + " purrs like this: ");
        myCat2.purr(myCat2.size);
    }
}
        