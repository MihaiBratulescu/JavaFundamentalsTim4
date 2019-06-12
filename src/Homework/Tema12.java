package Homework;

import java.util.Scanner;

public class Tema12
{
//    Se da un numar n. Sa se determine daca este numar prim.
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);

        int n;

        System.out.print("n=");
        n = scanner.nextInt();

        int nrDivizori = numarDivizori(n);

        if(nrDivizori > 2)
        {
            System.out.println("NU este prim");
        }
        else
        {
            System.out.println("Este prim");
        }
    }

    static int numarDivizori(int n) {
        int nrDivizori = 0;

        for(int i = 1; i <= n; i++)
        {
            if(n % i == 0)//este divizor
            {
                nrDivizori++;
            }
        }
        return nrDivizori;
    }
}
