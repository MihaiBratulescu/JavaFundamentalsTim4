package ziua2.d.Exercitii;

public class Problema13
{
    //Sa se scrie o functie care calculeaza
    //RECURSIV suma primelor 10 numere

    public static void main(String args[])
    {
        System.out.println(sumaCifreRecursiv(3));
    }

    static int sumaCifreRecursiv(int contor)
    {
        //s(4) = s(3)         + 4
        //s(4) = s(2)     + 3 + 4
        //s(4) = s(1) + 2 + 3 + 4
        //s(4) = 1    + 2 + 3 + 4

        if(contor <= 1)
            return contor;

        return contor +
            sumaCifreRecursiv(contor - 1);
    }

    static int produsCifreRecursiv(int contor)
    {
        if(contor == 1)
            return 1;

        return contor *
            produsCifreRecursiv(contor - 1);
    }
}
