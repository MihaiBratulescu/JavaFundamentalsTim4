package Homework;

import java.util.Scanner;

public class Tema22
{
//    Se da un numar n. Daca este pozitiv sa se afiseze numarul negativ.
//    Daca este negativ sa se afiseze numarul pozitiv.

    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);

        int n;

        System.out.println("n = ");
        n = scanner.nextInt();

        System.out.println(-n);
    }
}
