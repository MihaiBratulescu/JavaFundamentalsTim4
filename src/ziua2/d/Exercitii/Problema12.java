package ziua2.d.Exercitii;

public class Problema12
{
    //Sa se scrie o functie care calculeaza
    //factorial 5! = 5*4*3*2*1
    //0! = 1
    //1! = 1
    public static void main(String args[])
    {
        int factorial;

        factorial = factorialIterativ(5);
        System.out.println(factorial);

        factorial = factorialRecursiv(5);
        System.out.println(factorial);
    }

    static int factorialIterativ(int nr)
    {
        int rezultat = 1;

        while (nr > 1)
        {
            rezultat = rezultat * nr;
            nr--;
        }

        return rezultat;
    }

    static int factorialRecursiv(int nr)
    {
        //matematica
        //factorial 5! = 5*4*3*2*1
        //fact(n) = n * fact(n-1)

        if(nr == 1 || nr == 0)
        {
            return 1;
        }

        return factorialRecursiv(nr - 1) * nr;
    }
}
