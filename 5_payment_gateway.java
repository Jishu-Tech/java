import java.util.*;

interface UPIP
{
    public void payViaUPI();
}

interface CardPayment
{
    public void payViaCard();
}

class OnlinePayment implements UPIP, CardPayment
{
    double amount, bill;

    public void payViaUPI()
    {
        bill = amount * 0.5;
        System.out.println("Your bill via UPI is " + bill);
    }

    public void payViaCard()
    {
        bill = amount * 0.10;
        System.out.println("Your bill via Card is " + bill);
    }
}

class PaymentDemo
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Amount:");
        double amount = sc.nextDouble();

        OnlinePayment obj = new OnlinePayment();

        obj.amount = amount;

        obj.payViaUPI();
        obj.payViaCard();
    }
}