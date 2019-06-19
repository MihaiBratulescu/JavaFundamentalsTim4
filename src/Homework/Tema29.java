package Homework;

import java.util.Scanner;

public class Tema29
{
//    Folosing instructiunea switch sa se scrie un program care citeste
//    caractere de la tastatura pana cand se introduce 'q'
//    Si afiseaza la final toate caracterele citite.


    public static void main(String args[])
    {
        System.out.println("Introduceti caractere:");

        String result = readUnutilQ();

        System.out.println("Sa introdus: " + result);
    }

    private static String readUnutilQ() {
        String result = "";
        Scanner scanner = new Scanner(System.in);

        while (true)
        {
            String tmp = scanner.next();//citim String
            char c     = tmp.charAt(0);//luam doar primul caracter

            switch (c)
            {
                case 'q':
                    return result;
                default:
                    result = result + c;
                    break;
            }
        }
    }
}
