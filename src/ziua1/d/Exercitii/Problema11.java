package ziua1.d.Exercitii;

import java.util.Scanner;

public class Problema11
{
    //Sa se citeasca un nr de la tastatura
    //si sa se afiseze suma
    //primelor nr numere
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);

        int nr;//rezerv spatiu

        System.out.println("Introdu un nr:");
        nr = scanner.nextInt();

        int start = 1, suma = 0;

        while (start <= nr)
        {
            suma += start;
            start += 1;
        }

        System.out.println(
        "Suma primelor " +
        nr + " numere este: " + suma);
    }
}
