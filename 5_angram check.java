import java.util.Scanner;

class Anagram
{
    void check()
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first string:");
        String s = sc.nextLine();

        System.out.println("Enter second string:");
        String t = sc.nextLine();

        if(s.length() != t.length())
        {
            System.out.println("false");
            return;
        }

        char a[] = s.toCharArray();
        char b[] = t.toCharArray();

        for(int i = 0; i < a.length; i++)
        {
            for(int j = i + 1; j < a.length; j++)
            {
                if(a[i] > a[j])
                {
                    char temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }

                if(b[i] > b[j])
                {
                    char temp = b[i];
                    b[i] = b[j];
                    b[j] = temp;
                }
            }
        }

        int flag = 1;

        for(int i = 0; i < a.length; i++)
        {
            if(a[i] != b[i])
            {
                flag = 0;
                break;
            }
        }

        if(flag == 1)
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("false");
        }
    }
}

class UpDemo
{
    public static void main(String args[])
    {
        Anagram obj = new Anagram();

        obj.check();
    }
}