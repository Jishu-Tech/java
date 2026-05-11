import java.util.Scanner;

class Phone
{
    String map[] = {
            "",
            "",
            "abc",
            "def",
            "ghi",
            "jkl",
            "mno",
            "pqrs",
            "tuv",
            "wxyz"
    };

    void input()
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter digits:");
        String digits = sc.nextLine();

        combination(digits, "");
    }

    void combination(String digits, String ans)
    {
        if(digits.length() == 0)
        {
            System.out.print(ans + " ");
            return;
        }

        int num = digits.charAt(0) - '0';

        String letters = map[num];

        for(int i = 0; i < letters.length(); i++)
        {
            combination(digits.substring(1), ans + letters.charAt(i));
        }
    }
}

class Phonetest
{
    public static void main(String args[])
    {
        Phone obj = new Phone();

        obj.input();
    }
}