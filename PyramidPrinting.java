public class PyramidPrinting
{
    public static void pyramid(int n)
    {
        String s = "*";

        for (int i = 0; i < n; ++i)
        {
            System.out.print(" ");
            for (int j = 0; j < i; ++j)
            {
                System.out.print(s);
            }
            System.out.println();
        }
    }
    public static void main(String[] args)
    {
        pyramid(4);
    }
}
