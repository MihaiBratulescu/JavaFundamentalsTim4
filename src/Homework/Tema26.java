package Homework;

import java.util.Scanner;

public class Tema26
{
//    Se da n si k. Sa se afiseze (pe rand)
//    primii k multiplii ai numarului.

    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);

        int n1, n2, n3;

        System.out.println("n1 = ");
        n1 = scanner.nextInt();
        System.out.println("n2 = ");
        n2 = scanner.nextInt();
        System.out.println("n3 = ");
        n3 = scanner.nextInt();

        int suma = n1 + n2;

        if(suma > n3)
        {
            System.out.println("este mai mare");
        }
        else
        {
            System.out.println("nu este mai mare");
        }
    }
}
