import java.util.*;

class fibo 
{
    void series()
 {
        int n1 = 0, n2 = 1, sum = 0;

        System.out.print("Fibonacci Series: ");

        for (int i = 1; i <= 10; i++) {
            System.out.print(n1 + " ");
            sum = sum + n1;

            int next = n1 + n2;
            n1 = n2;
            n2 = next;
        }

        System.out.println("\nSum = " + sum);
    }
}

class fibofind
 {
    public static void main(String[] args) 
{
        fibo obj = new fibo();
        obj.series();
    }
}