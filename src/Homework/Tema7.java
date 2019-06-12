package Homework;

import java.util.Scanner;

public class Tema7
{
//    Se da un numar n. Sa se afiseze a doua cifra a numarului
//    sau prima daca nu are decat o cifra.
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);

        int n;

        System.out.print("n=");
        n = scanner.nextInt();

        while (n > 99)//are mai mult de 2 cifre
        {
            n = n / 10;//taiem ultima cifra
        }

        //acum n mai are cel mult 2 cifre
        //daca avea o cifra din start tot o cifra are si acum

        System.out.println(n % 10);
    }
}
