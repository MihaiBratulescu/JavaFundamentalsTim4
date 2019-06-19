package Homework;

import java.util.Scanner;

public class Tema28
{
//    Folosing instructiunea switch sa se scrie un program care
//    citeste un nr de la 1-5 si afiseaza pentru:
//        1 -> *
//        2 -> $
//        3 -> ^
//        4 -> !
//        5 -> ?


    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);

        int nr;

        System.out.println("nr = ");
        nr = scanner.nextInt();

        switch (nr)
        {
            case 1:
                System.out.println('*');
                break;
            case 2:
                System.out.println('$');
                break;
            case 3:
                System.out.println('^');
                break;
            case 4:
                System.out.println('!');
                break;
            case 5:
                System.out.println('?');
                break;
        }
    }

}
