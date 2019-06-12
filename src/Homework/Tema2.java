package Homework;

import java.util.Scanner;

public class Tema2
{
//    Fie doua numere a si b. Sa se determine daca reprezinta un
//    patrat sau doar un dreptunghi
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);

        int a, b;

        System.out.print("a=");
        a = scanner.nextInt();

        System.out.print("b=");
        b = scanner.nextInt();

        if(a == b)
        {
            System.out.println("patrat");
        }
        else
        {
            System.out.println("dreptunghi");
        }
    }
}
