import java.util.Scanner;
 class factor {
    void cal() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.println("Factors are:");

        for (int i = 1; i <= n; i++) {

            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
class printfact
{
  public static void main(String[] args)
  {
    factor obj = new factor();
    obj.cal();
   }
}
