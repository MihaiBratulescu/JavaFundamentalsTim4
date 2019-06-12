package Homework;

import java.util.Scanner;

public class Tema8
{
//    Se da un numar n. Sa se determine daca ULTIMA
//    cifra a numarului este si prima.
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);

        int n;

        System.out.print("n=");
        n = scanner.nextInt();

        int prima  = primacifra(n);
        int ultima = ultimaCifra(n);
        boolean suntEgale = prima == ultima;

        System.out.println(suntEgale);

        //sau mai pe scurt
        //System.out.println(ultimaCifra(n) == primacifra(n));
    }

    static int primacifra(int nr)
    {
        while (nr > 9)//are mai mult de o cifra
        {
            nr = nr / 10;//taie ultima cifra
        }

        return nr;
    }

    static int ultimaCifra(int nr)
    {
        return nr % 10;
    }
}
