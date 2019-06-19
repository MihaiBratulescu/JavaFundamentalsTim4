package Homework;

import java.util.Scanner;

public class Tema25
{
//    Se da n si k. Sa se afiseze (pe rand)
//    primii k multiplii ai numarului.

    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);

        int n, k;

        System.out.println("n = ");
        n = scanner.nextInt();
        System.out.println("k = ");
        k = scanner.nextInt();

        int multipluDeN = n;

        for(int i = 0; i < k; i++)
        {
            System.out.println(multipluDeN);
            multipluDeN += n;
        }
    }
}
