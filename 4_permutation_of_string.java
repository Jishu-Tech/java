import java.util.Scanner;

class Permutation
{
    void input()
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter String:");
        String str = sc.nextLine();

        permute(str, "");
    }

    void permute(String str, String ans)
    {
        if(str.length() == 0)
        {
            System.out.print(ans + " ");
            return;
        }

        for(int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);

            String left = str.substring(0, i);

            String right = str.substring(i + 1);

            String rem = left + right;

            permute(rem, ans + ch);
        }
    }
}

class UpDemo

{
    public static void main(String args[])
    {
        Permutation obj = new Permutation();

        obj.input();
    }
}