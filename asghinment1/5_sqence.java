import java.util.Scanner;
class Sequence {

    void printSequence(int n) {

        int a = 0, b = 1;   
        int ap = -1;        

        for (int i = 1; i <= n; i++) {

            if (i % 2 == 1) 
            {
                System.out.print(a);
                int next = a + b;
                a = b;
                b = next;

            }
	    else 
            {
                System.out.print(ap);
                ap = ap - 3;
            }

            if (i < n) 
            {
                System.out.print(",");
            }
        }
    }
}

class printSequence
   {
    public static void main(String args[])
     {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter limit: ");
        int n = sc.nextInt(); 

        Sequence obj = new Sequence();
        obj.printSequence(n); 
    }
}