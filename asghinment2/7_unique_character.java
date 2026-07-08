import java.util.Scanner;

class Unique
{
    void check()
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter String:");
        String str = sc.nextLine();

        int flag = 1;

        for(int i = 0; i < str.length(); i++)
        {
            for(int j = i + 1; j < str.length(); j++)
            {
                if(str.charAt(i) == str.charAt(j))
                {
                    flag = 0;
                    break;
                }
            }
        }

        if(flag == 1)
        {
            System.out.println("All characters are unique");
        }
        else
        {
            System.out.println("Duplicate characters found");
        }
    }
}

class upDemo
{
    public static void main(String args[])
    {
        Unique obj = new Unique();

        obj.check();
    }
}