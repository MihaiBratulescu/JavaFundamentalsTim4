package ziua1.d.Exercitii;

import java.util.Scanner;

public class Problema10
{
    //Sa se citeasca un nr de la tastatura
    //si sa se afiseze primele nr numere impare
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);

        int nr;//rezerv spatiu

        System.out.println("Introdu un nr:");
        nr = scanner.nextInt();

        int start = 1;

        while (start <= (nr * 2))
        {
            System.out.println(start);
            start += 2;
        }
    }
}
