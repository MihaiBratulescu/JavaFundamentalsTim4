package ziua1.d.Exercitii;

import java.util.Scanner;

public class Problema8
{
    //Sa se citeasca 3 nr de la tastatura
    //si sa se afiseze maximul
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);

        int nr1, nr2, nr3;//rezerv spatiu

        System.out.println("Introdu un nr1:");
        nr1 = scanner.nextInt();

        System.out.println("Introdu un nr2:");
        nr2 = scanner.nextInt();

        System.out.println("Introdu un nr3:");
        nr3 = scanner.nextInt();

        if(nr1 > nr2 && nr1 > nr3)
        {
            System.out.println(nr1);
        }
        else if(nr2 > nr3)
        {
            System.out.println(nr2);
        }
        else
        {
            System.out.println(nr3);
        }
    }
}
