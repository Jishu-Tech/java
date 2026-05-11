import java.util.Scanner;

class LongestWord
{
    void find()
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter sentence:");
        String str = sc.nextLine();

        String words[] = str.split(" ");

        String longest = words[0];

        for(int i = 1; i < words.length; i++)
        {
            if(words[i].length() > longest.length())
            {
                longest = words[i];
            }
        }

        System.out.println("Longest word: " + longest);
    }
}

class upDemo
{
    public static void main(String args[])
    {
        LongestWord obj = new LongestWord();

        obj.find();
    }
}