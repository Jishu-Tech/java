import java.util.Scanner;

class Filter
{
    void replaceWords()
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter text:");
        String text = sc.nextLine();

        String bad[] = {"bad", "ugly", "hate"};

        for(int i = 0; i < bad.length; i++)
        {
            text = text.replace(bad[i], "***");
        }

        System.out.println("Filtered Text:");
        System.out.println(text);
    }
}

class UpDemo
{
    public static void main(String args[])
    {
        Filter obj = new Filter();

        obj.replaceWords();
    }
}