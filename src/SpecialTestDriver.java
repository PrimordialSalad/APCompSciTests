public class SpecialTestDriver
{
    public static void main(String[] args)
    {
        int result;
        SpecialDeeBlock myClass1 = new SpecialDeeBlock();
        
        myClass1.classSize = 20;
        myClass1.block = 3;
        
        result = myClass1.calculator();
        System.out.println(result);
        
        System.out.println(myClass1.fred(result));
        //System.out.println(myClass1.calculator());
    }
}