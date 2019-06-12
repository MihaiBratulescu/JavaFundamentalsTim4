package Homework;

import java.util.Scanner;

public class Tema5
{
//    Fie doua numere a si b sa se returneze
//-suma daca a < b
//        sau
//-media daca b >= a (mai mare sau egal)
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);

        int a, b;

        System.out.print("a=");
        a = scanner.nextInt();

        System.out.print("b=");
        b = scanner.nextInt();

        if(a < b)
        {
            int suma = a + b;
            System.out.println(suma);
        }
        else
        {
            float media = (a + b) / 2f;
            System.out.println(media);
        }
    }
}
