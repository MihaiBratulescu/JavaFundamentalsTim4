package ziua2.b.Bucle;

public class LoopControlFlow4
{
    public static void main(String args[])
    {
        int n = 1;

        while (true)
        {
            if(n++ % 13 == 0)
                System.exit(0);

            System.out.println(n);
        }
    }
}
