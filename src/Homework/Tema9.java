package Homework;

import java.util.Scanner;

public class Tema9
{
//    Se da un numar n. Sa se determine cate cifre impare are numarul.
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);

        int n;

        System.out.print("n=");
        n = scanner.nextInt();

        int cifreImpare = 0;

        while (n != 0)
        {
            int ultima = n % 10;

            if(ultima % 2 != 0)//este impara
            {
                cifreImpare++;
            }

            n = n / 10; //taie ultima cifra
        }

        System.out.println("Cifre impare = " + cifreImpare);
    }
}
