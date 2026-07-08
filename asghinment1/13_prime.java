import java.util.*;

class PrimeCheck {
    int isPrime(int n) {
        if (n < 2)
            return 0;

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0)
                return 0;
        }

        return 1;
    }

    void checkSum(int num) {

        int found = 0;

        for (int i = 2; i <= num / 2; i++) {

            if (isPrime(i) == 1 && isPrime(num - i) == 1) {
                System.out.println(num + " = " + i + " + " + (num - i));
                found = 1;
            }
        }

        if (found == 0) {
            System.out.println("Not possible");
        }
    }
}

class prime {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        PrimeCheck obj = new PrimeCheck();
        obj.checkSum(n);
    }
}