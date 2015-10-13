public class Toad
{
    private int size;
    private int numWarts;
    
    public Toad()
    {
        size = 0;
        numWarts = 0;
    }
    public Toad(int givenSize)
    {
        size = givenSize;
    }
    public Toad(int givenSize, int givenNumWarts)
    {
        size = givenSize;
        numWarts = givenNumWarts;
    }

    public void setSize(int givenSize)
    {
        if (givenSize > 0)
        {
            size = givenSize;
        }
        else
        {
            System.out.println("That is an invalid size!");
        }
    }

    public int getSize()
    {
        return size;
    }

    public void setWarts(int givenWarts)
    {
        if (givenWarts >= 0)
        {
            numWarts = givenWarts;
        }
        else
        {
            System.out.println("That is an invalid amount of warts!");
        }
    }

    public int getWarts()
    {
        return numWarts;
    }
}