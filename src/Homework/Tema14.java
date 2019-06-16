package Homework;

import java.util.Scanner;

public class Tema14
{
//    Se dau doua numere a si b. Determinati cel mai mic multiplu cumun.
//    Ex: a = 3, b = 5 -> Output: 15
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);

        int a, b;

        System.out.print("a=");
        a = scanner.nextInt();

        System.out.print("b=");
        b = scanner.nextInt();

        int multDeA = a, multDeB = b;

        while (multDeA != multDeB)
        {
            if(multDeA < multDeB)
            {
                multDeA = multDeA + a;
            }
            else
            {
                multDeB = multDeB + b;
            }
        }

        System.out.println(multDeA);
    }
}
