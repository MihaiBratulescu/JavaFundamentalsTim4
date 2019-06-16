package Homework;

import java.util.Scanner;

public class Tema17
{
//    Se da un numar n. Care este cea mai mare cifra din numar?
//    Si inca o data pentru cea mai mica!

    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);

        int n;

        System.out.print("n=");
        n = scanner.nextInt();

        int max = ceaMaiMareCifra(n);
        int min = ceaMaiMicaeCifra(n);

        System.out.println("Max = " + max);
        System.out.println("Min = " + min);
    }

    private static int ceaMaiMicaeCifra(int n)
    {
        int min = n % 10;

        while (n > 0)
        {
            n = n / 10;

            int ultima = n % 10;
            if(ultima < min)//am gasit una mai mica
            {
                min = ultima;
            }
        }

        return min;
    }

    private static int ceaMaiMareCifra(int n)
    {
        int max = n % 10;

        while (n > 0)
        {
            n = n / 10;

            int ultima = n % 10;
            if(ultima > max)//am gasit una mai mare
            {
                max = ultima;
            }
        }

        return max;
    }
}
