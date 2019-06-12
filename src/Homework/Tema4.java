package Homework;

import java.util.Scanner;

public class Tema4
{
//    Se dau cele catetele si ipotenuza unui triunghi. Sa se
//    determine daca triunghiul este dreptunghic.
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);

        int cat1, cat2, ipo;

        System.out.print("cateta 1 =");
        cat1 = scanner.nextInt();

        System.out.print("cateta 2 =");
        cat2 = scanner.nextInt();

        System.out.print("ipotenuza =");
        ipo = scanner.nextInt();

        double catLaPatrat1 = Math.pow(cat1, 2);
        double catLaPatrat2 = Math.pow(cat2, 2);
        double ipotLaPatrat = Math.pow(ipo, 2);

        if(catLaPatrat1 + catLaPatrat2 == ipotLaPatrat)
        {
            System.out.println("este triunghi dreptungic");
        }
        else
        {
            System.out.println("NU este triunghi dreptungic");

        }
    }
}
