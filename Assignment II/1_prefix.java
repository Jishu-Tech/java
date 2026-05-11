import java.util.Scanner;

class Prefix
{
    void common()
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of strings:");
        int n = sc.nextInt();
        sc.nextLine();

        String strs[] = new String[n];

        for(int i = 0; i < n; i++)
        {
            System.out.println("Enter string:");
            strs[i] = sc.nextLine();
        }

        String prefix = "";

        for(int i = 0; i < strs[0].length(); i++)
        {
            char ch = strs[0].charAt(i);

            boolean same = true;

            for(int j = 1; j < n; j++)
            {
                if(i >= strs[j].length() || strs[j].charAt(i) != ch)
                {
                    same = false;
                    break;
                }
            }

            if(same)
            {
                prefix = prefix + ch;
            }
            else
            {
                break;
            }
        }

        System.out.println("Longest Common Prefix = " + prefix);
    }
}

class UpDemo
{
    public static void main(String args[])
    {
        Prefix obj = new Prefix();
        obj.common();
    }
}