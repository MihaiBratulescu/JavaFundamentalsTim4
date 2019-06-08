package ziua1.d.Exercitii;

import java.util.Scanner;

public class Problema13
{
    //Sa se citeasca un numere de la
    //tastatura si sa se calculeze suma
    //pana cand se introduce un nr negativ

    //Ex: 4     6    0   2       -10
    //Suma: 12

    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);

        int nr, suma = 0;

        //DO-WHILE
        //garantat ca bucla se executa
        //cel putin o data, pe cand WHILE
        //nu se executa niciodata
        //daca conditia este falsa!
        do{
            System.out.println("Introdu un nr:");
            nr = scanner.nextInt();
            if (nr > 0)
            {
                suma += nr;
            }
        }while(nr >= 0);

        System.out.println("Suma este: " + suma);
    }
}
