package ziua2.a.InstructiuniNoi;

public class PlusPlusMinusMinus
{
    public static void main(String args[])
    {
        int nr = 5;

        nr++;//nr += 1;
        System.out.println(nr);

        nr--;//nr -= 1;
        System.out.println(nr);

        int x = 4;
        System.out.println(x++);
        System.out.println(x);
        System.out.println(++x);

        //x = 6
        int sum;
        System.out.println("Ecuatii");

        sum= 2 + x++;
        System.out.println(sum);
        //x = 7

        sum = 2 + ++x;
        System.out.println(sum);

        //x = 8
        if(x++ == 8)//true
        {
            System.out.println(x);
        }
        //x = 9
        if(--x == 8)//true
        {
            System.out.println(x);
        }
    }
}
