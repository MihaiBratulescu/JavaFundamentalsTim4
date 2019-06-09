package ziua2.b.Bucle;

public class LoopControlFlow
{
    public static void main(String args[])
    {
        int n = 5;

        while (true)
        {
            System.out.println("Infinite loop 1");
            if(n-- == 3)
            {
                break;
            }
        }

        while (true)
        {
            System.out.println("Infinite loop 2 " + n);
            while (true)
            {
                System.out.println("Infinite inner loop " + n);
                if(n == 0)
                {
                    break;
                }
                n--;
            }
            //what does this print?
            break;
        }
    }
}
