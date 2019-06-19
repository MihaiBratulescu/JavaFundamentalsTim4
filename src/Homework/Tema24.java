package Homework;

import java.util.Scanner;

public class Tema24
{
//    Sa se citeasca un String si sa se afiseze pe cate un rand fiecare caracter.

    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);

        String s;

        s = scanner.next();

        for(int i = 0; i < s.length(); i++)
        {
            char c = s.charAt(i);
            System.out.println(c);
        }
    }
}
