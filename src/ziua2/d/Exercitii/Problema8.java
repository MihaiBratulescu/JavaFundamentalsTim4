package ziua2.d.Exercitii;

public class Problema8 {
    //Sa se scrie o functie care
    //afizeaza prima cifra
    public static void main(String args[])
    {
        primaCifra(7560);
    }

    static void primaCifra(int nr)
    {
        while (nr > 9)//are mai mult de o cifra
        {
            nr = nr / 10;//taie ultima cifra
        }

        System.out.println(nr);
    }

    //primaCifraRecursiv(123)
        //primaCifraRecursiv(12)
            //primaCifraRecursiv(1)

    static int primaCifraRecursiv(int nr)
    {
        if(nr < 10)//am o singura cifra
        {
            return nr;
        }

        return primaCifraRecursiv(nr / 10);
    }
}
