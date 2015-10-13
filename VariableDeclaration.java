public class VariableDeclaration
{
    public static void main(String[] args)
    {
        //Declaration of interger variable section.
        int k = 12;
        int x = 9;
        int y = 4;
        int z = 5;
        int i = x * y;
        System.out.println("Z = " + z);
        z = z * i;
        System.out.println(i + (x +z));
        System.out.println(i + " " + x);
        System.out.println(k);
        System.out.println("Z = " + z);
        
        //After this point is declaration of a string variable section.
        String name = "";
        System.out.println(name);
        String myFirstString = "dog";
        System.out.print(myFirstString);
        System.out.println(" is not cat");
        String mySecondString = "not dog";
        String myThirdString = myFirstString + " " + mySecondString;
        System.out.println(myThirdString);
    }
}