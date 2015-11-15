class LG1
{
    public static void main(String[] args)
    {
        int x = 5;
        x = x - 1;
        int a = 3;
        double b = a * 1.5; //4.5
        if (x > 4)
        {
            System.out.print(a + " " + b);
        }
        if (x > 3)
        {
            System.out.print(" " +  ((a * b) + a));
        }
        if (x > 2)
        {
            System.out.print(" " + a * a / b);
        }
        if (x > 1)
        {
            System.out.print(" " + a * b * 17);
        }
        if (x > 0)
        {
            System.out.print(" Now I am the master");
        }
    }
}