import java.util.Scanner;

class FindGCD
{
    void calc(int a, int b)
    {
        int gcd = 1;

        for(int i = 1; i <= a && i <= b; i++)
        {
            if(a % i == 0 && b % i == 0)
            {
                gcd = i;
            }
        }

        System.out.println("GCD = " + gcd);
    }
}

class gcd
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int x = sc.nextInt();

        System.out.print("Enter second number: ");
        int y = sc.nextInt();

        FindGCD obj = new FindGCD();
        obj.calc(x, y);
    }
}