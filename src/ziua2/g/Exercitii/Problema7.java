package ziua2.g.Exercitii;

public class Problema7 {
    //Sa se scrie o functie care
    //calculeaza inversul unui numar (oglinditul)
    //si inca o data folosind for
    public static void main(String args[])
    {
        int numar = oglinditulFor(123);
        System.out.println(numar);
    }

    static int oglinditul(int n)
    {
        int rezultat = 0;
        while (n > 0)
        {
            int ultima = n % 10;
            rezultat = rezultat * 10 + ultima;
            n = n / 10;
        }

        return rezultat;
    }

    static int oglinditulFor(int n)
    {
        int rezultat;

        for(rezultat = 0; n > 0; n = n / 10)
        {
            int ultima = n % 10;
            rezultat = rezultat * 10 + ultima;
        }

        return rezultat;
    }
}
