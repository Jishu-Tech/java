import java.util.Scanner;
import java.net.*;

class urltest
{
    Scanner sc = new Scanner(System.in);

    void show()
    {
        try
        {
            System.out.println("Enter URL:");
            String s = sc.nextLine();

            URL obj = new URL(s);

            System.out.println(obj.getHost());
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}

class upDemo
{
    public static void main(String args[])
    {
        urltest obj = new urltest();

        obj.show();
    }
}