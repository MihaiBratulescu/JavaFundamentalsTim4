package ziua1.d.Exercitii;

import java.util.Scanner;

public class Problema4
{
    //Sa se citeasca doua nr de la tastatura
    //si sa se afiseze restul impartirii
    //lui a la b
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);

        int a, b;//rezerv spatiu

        System.out.println("Introdu a:");
        a = scanner.nextInt();

        System.out.println("Introdu b:");
        b = scanner.nextInt();

        System.out.println("Restul impartirii: " + a % b);
    }
}
