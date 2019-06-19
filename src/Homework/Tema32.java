package Homework;

import java.util.Scanner;

public class Tema32
{
//    Cel mai mare divizor comun


    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);

        int a, b;

        System.out.print("a=");
        a = scanner.nextInt();

        System.out.print("b=");
        b = scanner.nextInt();

        System.out.println(cmmdc(a, b));
    }

    private static int cmmdc(int a, int b)
    {
        for(int i = Math.min(a, b); i > 0; i--)
        {
            if(a % i == 0 && b % i == 0)
            {
                return i;
            }
        }

        return 1;
    }

}
