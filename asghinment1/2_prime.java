import java.util.*;

class third
{
    void prime()
    {
        for (int i = 2; i <= 1000; i++)
        {
            fact(i);
        }
    }

    void fact(int n)
    {
        int c = 0;
        for(int i = 1; i <= n; i++)
        {
            if(n % i == 0)
            {
                c = c + 1;
            }
        }

        if(c == 2)
        {
            System.out.print(n + " ");
        }
    }
}

class factfind
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        third obj = new third();
        obj.prime();  
    }
}