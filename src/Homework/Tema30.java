package Homework;

import java.util.Scanner;

public class Tema30
{
//    Sa se scrie un program care citeste caractere si afiseaza pozitia lor
//    din tabelul ASCII.


    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("c = ");

        char c = scanner.next().charAt(0);

        int pozitie = (int) c;
        System.out.println(pozitie);
    }

}
