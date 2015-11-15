public class FibonacciSequenceTest
{
    public static int fib(int n)
    {
        int last = 1;
        int first = 1;
        int sum = 0;
        for (int j = 0; j < n; ++j)
        {            
            sum = first + last;
            if ((j == 0 || j ==1) &&(sum == 2))
            {
                sum = 1;
            }
            last = first;
            first = sum;
        }
        return sum;
    }

    public static int recFib(int n)
    {
        if(n == 0 || n == 1)
            return n;
        return recFib(n - 1) + recFib(n -2);
    }
    public static int johnFib(int n)//Incomplete method code.
    {
        int last = 1;
        int first = 1;
        int sum = 0;
        if (n < 2)
        {
            return 1;
        }
        for (int j = 0;  j < n; ++j)
        {
            sum = first + last;
            last = first;
            first = sum;
        }
        return sum;
    }
    public static void main(String[] args)
    {
        int x = 5;
        System.out.println(recFib(x));
    }
}
