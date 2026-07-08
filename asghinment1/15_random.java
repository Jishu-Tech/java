import java.util.Random;

class random
{
    void show()
    {
        Random r = new Random();

        for(int i = 1; i <= 5; i++)
        {
            int num = r.nextInt(100) + 1; 
            System.out.println(num);
        }
    }
}

class checkrandom
{
    public static void main(String[] args)
    {
        random obj = new random();
        obj.show();
    }
}