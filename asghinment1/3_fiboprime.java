class FibPrime
{
    void show()
    {
        int a = 0, b = 1, c;
        int count = 0;

        while(count < 8)
        {
            c = a + b;
            a = b;
            b = c;

            int f = 0;
            for(int i = 1; i <= c; i++)
            {
                if(c % i == 0)
                    f++;
            }

            if(f == 2)
            {
                System.out.print(c + " ");
                count++;
            }
        }
    }
}

class fibocal
{
    public static void main(String[] args)
    {
        FibPrime obj = new FibPrime();
        obj.show();
    }
}