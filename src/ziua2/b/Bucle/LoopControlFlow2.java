package ziua2.b.Bucle;

public class LoopControlFlow2
{
    public static void main(String args[])
    {
        int n = 1;

        while (true)
        {
            if(n++ % 2 == 0)
                continue;

            System.out.println(n);
            System.out.println(n);
        }
    }
}
