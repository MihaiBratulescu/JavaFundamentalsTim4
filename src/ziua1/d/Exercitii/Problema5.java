package ziua1.d.Exercitii;

import java.util.Scanner;

public class Problema5
{
    //Sa se citeasca doua numere
    //si sa se afiseze daca sunt egale
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);

        int nr1, nr2;//rezerv spatiu

        System.out.println("Introdu un nr1:");
        nr1 = scanner.nextInt();

        System.out.println("Introdu un nr2:");
        nr2 = scanner.nextInt();

        boolean suntEgale = nr1 == nr2;

        System.out.println("Sunt egale?");
        System.out.println(suntEgale);
    }
}
