import java.util.Scanner;

class product
{
    String p_name;
    int p_price;

    product(String p_name1,int p_price1)
    {
        this.p_name = p_name1;
        this.p_price = p_price1;
    }

    public void displayDetails()
    {
        System.out.println("product name : " + p_name);
        System.out.println("product price : " + p_price);
    }
}

class Electronics extends product
{
    String p_warranty;

    Electronics(String p_name, int p_price, String p_warranty)
    {
        super(p_name, p_price);
        this.p_warranty = p_warranty;
    }

    public void displayDetails()
    {
        super.displayDetails();
        System.out.println("Warranty valid : " + p_warranty);
    }
}
class Smartohone extends Electronics
{
 String batary_life;
 Smartohone(String p_name, int p_price, String p_waranty, String batary_life)
 {
   super(p_name, p_price,p_waranty);
   this.batary_life=batary_life;
 }
  public void displayDetails()
    {
        super.displayDetails();
        System.out.println("batary_life valid: " + batary_life);
    }
}
class phone
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter product name:");
    String product = sc.nextLine();
    System.out.println("Enter price");
    int price=sc.nextInt();
    sc.nextLine();
    System.out.println("Enter waranty");
    String waranty=sc.nextLine();
    System.out.println("Enter batary life:");
    String batary_life=sc.nextLine();
   

   Smartohone obj= new Smartohone(product,price,waranty,batary_life);
   System.out.println("\nSmartohone Details");
   obj.displayDetails();
  }
}


