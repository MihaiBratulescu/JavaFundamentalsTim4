package ziua2.b.Bucle;

public class ForLoop
{
    public static void main(String args[])
    {
//        Canonical form (structura):
//        for(initialization ; condition ; iteration)
//        {
//             statement or block of code
//        }

        int i1 = 0;
        while (i1 < 10)
        {
            //statement or block of code
            i1++;
        }

        for(int i2 = 0; i2 < 10; i2++)
        {
            //statement or block of code
        }

        //Nu este echivalent cu
        while (i1 < 10)
        {
            //statement or block of code
            i1++;
            //statement or block of code
        }

        int i;
        for(i = 2; i < 7; i++)
        {
            System.out.println(i);
        }

        for(int x1 = 20, x2 = 3; (x1 > x2) && (x2 % 2 != 0); x1++, x2+=2)
        {
            System.out.printf("%d vs %d\n", x1, x2);
        }

        for(;;)//for infinit
        {

        }
    }

}
