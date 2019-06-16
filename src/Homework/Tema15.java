package Homework;

import java.util.Scanner;

public class Tema15
{
//    Se dau doua numere a si b. Sa se afiseze (pe rand) toate numerele
//    dintre a si b in ordine crescatoare

    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);

        int start, end;

        System.out.print("start=");
        start = scanner.nextInt();

        System.out.print("end=");
        end = scanner.nextInt();

        if(start > end)
        {
            int temp = start;
            start = end;
            end = temp;
        }

        for(int i = start + 1; i < end; i++)
        {
            System.out.println(i);
        }
    }
}
