package Homework;

import java.util.Scanner;

public class Tema21
{
//Se da un numar n. Determinati suma 1 + 1*2 + 1*2*3 + .... 1*2*3*....*n

    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);

        int n;

        System.out.println("n = ");
        n = scanner.nextInt();

        //1 + 1*2 + 1*2*3 + .... 1*2*3*....*n
        //Vedem ca este suma de factorial
        //1! + 2! + 2! + .... n!

        int suma = 0;

        for(int i = 1; i <= n; i++)
        {
            suma = suma + factorial(i);
        }

        System.out.println(suma);
    }

    private static int factorial(int n)
    {
        int rezultat = 1;

        for(int i = 1; i <= n; i++)
        {
            rezultat = rezultat * i;
        }

        return rezultat;
    }
}
