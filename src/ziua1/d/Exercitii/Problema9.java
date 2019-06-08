package ziua1.d.Exercitii;

import java.util.Scanner;

public class Problema9
{
    //Sa se citeasca un nr de la tastatura
    //si sa se afiseze primele nr numere
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);

        int nr;//rezerv spatiu

        System.out.println("Introdu un nr:");
        nr = scanner.nextInt();

//        System.out.println(1);
//        System.out.println(2);
//        System.out.println(3);
//        System.out.println(4);
//        ...

        int start = 1;

        while (start <= nr)
        {
            System.out.println(start);
            start += 1;
        }
    }
}
