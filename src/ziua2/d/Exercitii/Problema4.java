package ziua2.d.Exercitii;

public class Problema4
{
    //Cate cifre are un numar
    public static void main(String args[])
    {
        int cifre = numarDeCifre(5865);
        System.out.println(cifre);
    }

    static int numarDeCifre(int n)
    {
        int nrCifre = 1;

        while (n > 9)
        {
            n = n / 10;//taie ultima cifra
            nrCifre++;
        }

        return nrCifre;
    }

}
