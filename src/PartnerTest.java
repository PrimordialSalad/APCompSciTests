public class PartnerTest
{
    public static void main(String[] args)
    {
        int x = 0;
        int y = 1;
        while (x < 7)
        {
            if (y < 4)
            {
                y = y + 2;
                if (x <= 3)
                {
                    x = x + 1;
                }
            }
            System.out.print(x + "" + y + " ");
            x = x + 2;
        }
    }
}