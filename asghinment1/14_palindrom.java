import java.util.Scanner;

class CheckPalindrome
{
    void check(int num)
    {
        int rev = 0, temp = num;

        while(num > 0)
        {
            int d = num % 10;
            rev = rev * 10 + d;
            num = num / 10;
        }

        if(temp == rev)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}

class palindrmch
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();

        CheckPalindrome obj = new CheckPalindrome();
        obj.check(n);
    }
}