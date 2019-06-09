package ziua2.b.Bucle;

public class LoopControlFlow3
{
    public static void main(String args[])
    {
        int n = 1;

        while (true)
        {
            if(n++ % 13 == 0)
                return;

            System.out.println(n);
        }

        //System.out.println("Gata");

    }
}
