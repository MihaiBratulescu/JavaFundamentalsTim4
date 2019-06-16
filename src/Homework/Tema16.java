package Homework;

import java.util.Scanner;

public class Tema16
{
//    Se da un numar n. Determinati suma cifrelor de la 0 la n.

    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);

        int n;

        System.out.print("n=");
        n = scanner.nextInt();

        int suma = 0;

        for(int i = 1; i < n; i++)
        {
            suma = suma + i;
        }

        System.out.println(suma);
    }
}
