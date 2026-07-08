import java.util.Scanner;

class Password
{
    Scanner sc = new Scanner(System.in);

    void input()
    {
        System.out.println("Enter Password:");
        String s = sc.nextLine();

        char str[] = s.toCharArray();

        int result = CheckPassword(str, str.length);

        System.out.println(result);
    }

    int CheckPassword(char str[], int n)
    {
        int cap = 0;
        int num = 0;

        if(n < 4)
        {
            return 0;
        }

        if(str[0] >= '0' && str[0] <= '9')
        {
            return 0;
        }

        for(int i = 0; i < n; i++)
        {
            if(str[i] == ' ' || str[i] == '/')
            {
                return 0;
            }

            if(str[i] >= 'A' && str[i] <= 'Z')
            {
                cap = 1;
            }

            if(str[i] >= '0' && str[i] <= '9')
            {
                num = 1;
            }
        }

        if(cap == 1 && num == 1)
        {
            return 1;
        }

        return 0;
    }
}

class UpDemo
{
    public static void main(String args[])
    {
        Password obj = new Password();

        obj.input();
    }
}