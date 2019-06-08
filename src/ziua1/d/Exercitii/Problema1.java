package ziua1.d.Exercitii;

import java.util.Scanner;

public class Problema1
{
    //Sa se citeasca un nr de la tastatura
    //si sa se afiseze
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);

        int nr;//rezerv spatiu

        System.out.println("Introdu un nr:");
        //citesc din consola (de la tastatura)
        nr = scanner.nextInt();
        //nextInt() pentru citire numar intreg

        System.out.println(nr);
    }
}
