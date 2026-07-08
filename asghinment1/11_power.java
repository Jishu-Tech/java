import java.util.*;

 class power {
       void calc()
       {
        Scanner sc = new Scanner(System.in);
	int base,exp,result = 1;

        System.out.print("Enter base: ");
        base = sc.nextInt();

        System.out.print("Enter power: ");
        exp = sc.nextInt();

           for (int i = 1; i <= exp; i++) {
            result = result * base;
        }

        System.out.println("Result = " + result);
    }
}
class powercheck
{
 public static void main(String[] args)
 {
   power obj=new power();
   obj.calc();
  }
};
