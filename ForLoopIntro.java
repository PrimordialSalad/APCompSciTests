public class ForLoopIntro
{
  public static void main(String[] args)
  {
      int sum = 0;
      String phrase = "Hello World";
      
      for (int i = 0; i < phrase.length(); i++)
      {
          System.out.print(phrase.substring(i, i + 1));
          for (int x = 0; x < 5; x++)
          {
              sum = sum + i;
              System.out.println(sum);
            }
        }
    }
}