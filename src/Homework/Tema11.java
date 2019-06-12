package Homework;

import java.util.Scanner;

public class Tema11
{
//    Se da un numar n. Sa se determine daca PRIMA cifra a numarului e para.
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);

        int n;

        System.out.print("n=");
        n = scanner.nextInt();

        while (n > 9)//are mai mult de o cifra
        {
            n /= 10;//n = n / 10
        }

        //acum n mai are doar o cifra

        System.out.println(n % 2 == 0);
    }
}
