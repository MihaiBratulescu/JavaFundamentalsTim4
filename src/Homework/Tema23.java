package Homework;

import java.util.Scanner;

public class Tema23
{
//    Sa se citeasca pe rand numele apoi prenumele si sa se afiseze numele complet

    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);

        String nume, prenume;

        System.out.println("nume = ");
        nume = scanner.next();
        System.out.println("prenume = ");
        prenume = scanner.next();

        System.out.println(nume + " " + prenume);
    }
}
