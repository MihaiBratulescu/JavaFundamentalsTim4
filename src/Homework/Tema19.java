package Homework;

import java.util.Scanner;

public class Tema19
{
//    Se da un numar n. Sa se afiseze numarul de divizori ai numarului.

    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);

        int n, contor = 0;

        System.out.print("n=");
        n = scanner.nextInt();

        for(int i = 1; i < n; i++)
        {
            if(n % i == 0)//divizor
            {
                contor++;
            }
        }

        System.out.println(contor);
    }
}
