package Homework;

import java.util.Scanner;

public class Tema10
{
//   Se da un numar n. Sa se determine suma cifrelor sale.
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);

        int n;

        System.out.print("n=");
        n = scanner.nextInt();

        int suma = 0;

        while (n != 0)
        {
            int ultima = n % 10;

            suma += ultima;// suma = suma + ultima
            n /= 10;//n = n / 10
        }

        System.out.println("suma cifrelor = " + suma);
    }
}
