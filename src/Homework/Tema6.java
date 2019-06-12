package Homework;

import java.util.Scanner;

public class Tema6
{
    //Se da un numar n. Sa se calculeze n + n*n + n*n*n.
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);

        int n;

        System.out.print("n=");
        n = scanner.nextInt();

        System.out.println(n + n*n + n*n*n);
    }
}
