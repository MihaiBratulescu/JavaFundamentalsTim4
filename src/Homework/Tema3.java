package Homework;

import java.util.Scanner;

public class Tema3
{
//    Se da un numar n. Sa se afiseze toate numerele mai mici
//    decat n care sunt divizibile cu 3 si 7.
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);

        int n, start;

        System.out.print("n=");
        n = scanner.nextInt();

        start = 3 * 7;

        while (start < n)
        {
            if(start % 3 == 0 && start % 7 == 0)
            {
                System.out.println(start);
            }
            start++;
        }
    }
}
