import java.util.Scanner;

 class Factorial {

    void fact(int n) {

        int f = 1;

        for (int i = 1; i <= n; i++) {
            f = f * i;
        }

        System.out.println("Factorial of "+n +" is= " + f);
    }
}


class findfact {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        Factorial obj = new Factorial();
        obj.fact(n);
    }
}