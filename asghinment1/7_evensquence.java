import java.util.Scanner;
class Sequence 
 {
    void cal(int n) 
    {
        int even = 2;
        int fact = 1;
        int k = 1;
        for (int i = 1; i <= n; i++) 
       {

            if (i % 2 == 1) 
           {
                System.out.print(even);
                even = even + 2;

            } 
            else 
            {
                fact = fact * k;
                System.out.print(fact);
                k++;
            }

            if (i < n)
            {
                System.out.print(",");
            }
        }
    }
}

class Sequence7 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter limit: ");
        int n = sc.nextInt();

        Sequence obj = new Sequence();
        obj.cal(n);
    }
}