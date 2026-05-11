import java.util.Scanner;

class TitleCase
{
    void convert()
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter sentence:");
        String str = sc.nextLine();

        String words[] = str.split(" ");

        String result = "";

        for(int i = 0; i < words.length; i++)
        {
            String word = words[i];

            char first = Character.toUpperCase(word.charAt(0));

            String rest = word.substring(1);

            result = result + first + rest + " ";
        }

        System.out.println("Title Case:");
        System.out.println(result);
    }
}

class upDemo
{
    public static void main(String args[])
    {
        TitleCase obj = new TitleCase();

        obj.convert();
    }
}