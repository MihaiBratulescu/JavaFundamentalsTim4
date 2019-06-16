package Homework;

import java.util.Scanner;

public class Tema20
{
//Se da un numar n. Sa se verifice daca cifrele sale sunt in ordine crescatoare.

    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);

        int n;

        System.out.println("n = ");
        n = scanner.nextInt();

        boolean suntInOrdine = suntInOrdine(n);

        System.out.println(suntInOrdine);
    }

    private static boolean suntInOrdine(int n)
    {
        //incepem de la coada si comparam numelere
        while (n > 0)
        {
            int ultima = n % 10;
            n = n / 10;
            int penultima = n % 10;

            if(ultima < penultima)//am gasit ca nu sunt in ordine crescatoare
            {
                return false;
            }
        }

        return true;
    }
}
