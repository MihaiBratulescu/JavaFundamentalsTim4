package Homework;

import java.util.Scanner;

public class Tema1
{
    //Fie doua numere a si b. Sa se determine daca a este multiplu de b
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);

        int a, b;

        System.out.print("a=");
        a = scanner.nextInt();

        System.out.print("b=");
        b = scanner.nextInt();

        System.out.println(a + " multiplu de " + b);
        System.out.println(a % b == 0);
    }
}
