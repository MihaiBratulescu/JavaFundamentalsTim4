package ziua1.d.Exercitii;

import java.util.Scanner;

public class Problema2
{
    //Sa se citeasca doua nr de la tastatura
    //si sa se afiseze suma si media
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);

        int nr1, nr2;//rezerv spatiu

        System.out.println("Introdu un nr 1: ");
        nr1 = scanner.nextInt();

        System.out.println("Introdu un nr 2: ");
        nr2 = scanner.nextInt();

        System.out.println("Suma este: " + (nr1 + nr2));

        float media = (nr1 + nr2) / 2f;
        System.out.println("Media este: " + media);
    }
}
