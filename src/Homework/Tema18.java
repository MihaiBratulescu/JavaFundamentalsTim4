package Homework;

import java.util.Scanner;

public class Tema18
{
//    Se da un numar n. Sa se afiseze (pe rand) toti divizorii numarului.

    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);

        int n;

        System.out.print("n=");
        n = scanner.nextInt();

        for(int i = 1; i < n; i++)
        {
            if(n % i == 0)//divizor
            {
                System.out.println(i);
            }
        }
    }
}
