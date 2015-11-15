public class NikkiBrettBilly
{
    public static void main(String[] args)
    {
        for(int x = 0; x < 3; x++)
        {
            String phrase = "NikkiBrettBilly";
            System.out.println((x+1) + ". " + phrase.substring((x*5), ((x*5)+5)));
        }
    }
}