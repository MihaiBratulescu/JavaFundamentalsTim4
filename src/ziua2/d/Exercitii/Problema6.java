package ziua2.d.Exercitii;

public class Problema6 {
    //Sa se scrie o functie care
    //afiseaza numarul inversat
    public static void main(String args[])
    {
        afisareNumarulInversat(1234);
        System.out.println();
        afisareNumarulInversat(0);
    }

    static void afisareNumarulInversat(int n)
    {
        do
        {
            int ultimaCifra = n % 10;
            System.out.print(ultimaCifra);
            n = n / 10;
        }while (n > 0);
    }
}
