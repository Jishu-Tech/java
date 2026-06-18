import java.util.Scanner;

abstract class Payment
{
    double amount;

    Payment(double amount)
    {
        this.amount = amount;
    }

    abstract void process();
}

class CreditCardPayment extends Payment
{
    String transactionId;
    CreditCardPayment(double amount, String transactionId)
    {
        super(amount);
        this.transactionId = transactionId;
    }

    void process()
    {
        double fee = amount * 0.02;
        double total = amount + fee;

        System.out.println("Credit Card Payment");
        System.out.println("Transaction ID : " + transactionId);
        System.out.println("Amount : " + amount);
        System.out.println("Fee : " + fee);
        System.out.println("Total : " + total);
    }
}

class PayPalPayment extends Payment
{
    String transactionId;

    PayPalPayment(double amount, String transactionId)
    {
        super(amount);
        this.transactionId = transactionId;
    }

    void process()
    {
        double fee = amount * 0.03;
        double total = amount + fee;

        System.out.println("PayPal Payment");
        System.out.println("Transaction ID : " + transactionId);
        System.out.println("Amount : " + amount);
        System.out.println("Fee : " + fee);
        System.out.println("Total : " + total);
    }
}

class online
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter amount:");
        double amount = sc.nextDouble();

        System.out.println("1. Credit Card");
        System.out.println("2. PayPal");

        int choice = sc.nextInt();
        sc.nextLine();

        Payment p;


       if(choice == 1)
       {
        System.out.println("Enter Transaction ID:");
        String tid = sc.nextLine();
        p = new CreditCardPayment(amount, tid);
       }
       else
      {
        System.out.println("Enter Transaction ID:");
        String tid = sc.nextLine();
        p = new PayPalPayment(amount, tid);
      }

     p.process();
    }
}