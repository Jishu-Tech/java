import java.util.*;
class seris {
     void calac() {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        double sum = 0;
        int fact = 1;

        for (int i = 1; i <= n; i++) {

            fact = fact * i;       
            sum = sum + (1.0 / fact);
        }

        System.out.println("Sum = " + sum);
    }
}
class printseris
{
 public static void main(String[] args)
 {
  seris obj = new seris();
  obj.calac();
 }
}