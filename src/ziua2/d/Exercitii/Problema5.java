package ziua2.d.Exercitii;

import java.util.Scanner;

public class Problema5 {
    //Sa se scrie o functie care
    //calculeaza suma cifrelor unui numar
    public static void main(String args[])
    {
        int suma = sumaCifrelor(123);
        System.out.println(suma);
    }

    static int sumaCifrelor(int n)
    {
        int suma = 0;
        while (n > 0)
        {
            int ultimaCifra = n % 10;
            suma = suma + ultimaCifra;
            n = n / 10;
        }

        return suma;
    }
}
