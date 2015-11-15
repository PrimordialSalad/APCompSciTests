public class PlayingWithString
{
    public static void main(String[] args)
    {
        String phrase1 = "To begin, begin";
        String phrase2 = " Dendy";
        String phrase3 = "Books on hooks";
        int length1 = phrase1.length();
        int length2 = phrase2.length();
        int length3 = phrase3.length();
        int totalLength = phrase1.length() + phrase2.length() + phrase3.length();
        boolean equalPhrase = phrase2.substring(1).equals(phrase2.trim());
        
        System.out.println(phrase1.substring(3, 7));
        System.out.println(phrase2.substring(1, 2) + phrase3.substring(1));
        System.out.println("The length of phrase 1is: " + length1);
        System.out.println("The length of phrase 2 is: " + length2);
        System.out.println("The length of phrase 3 is: " + length3);
        System.out.println("The total length of all the phrases is : " + totalLength);
        System.out.println(phrase2);
        System.out.println(phrase2.trim());
        System.out.println(equalPhrase);
        
    }
}