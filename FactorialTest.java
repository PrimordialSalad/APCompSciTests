public class FactorialTest
{
    public static int fac(int n)
    {
        if( n == 1)
            return 1;
        return n * fac(n - 1);
    }

    public static void main(String [] args)
    {
        int x = 5;

        System.out.println(fac(x));
    }
}
