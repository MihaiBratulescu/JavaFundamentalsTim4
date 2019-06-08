package ziua1.d.Exercitii;

import java.util.Scanner;

public class Problema14
{
    //Prima cifra a unui numar
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introdu un nr:");
        int nr = scanner.nextInt();

        //ex cel mai usor (convenabil)
        //nr = 6;
        //Daca nr < 10 => prima cifra : nr

        //ex: nr = 247

        //pana cand nr > 10
        //tai ultima cifra: nr = nr / 10
        //prima cifra: nr

        while (nr > 10)
        {
            nr = nr / 10;
        }

        System.out.println("Prima cifra este: " + nr);
    }
}
