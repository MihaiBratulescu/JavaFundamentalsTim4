package Homework;

import java.util.Scanner;

public class Tema13
{
//    Se da un numar n si o cifra k. Sa se determine de cate ori
//    apare cifra k in numarul n.
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);

        int n, k;

        System.out.print("n=");
        n = scanner.nextInt();

        System.out.print("k=");
        k = scanner.nextInt();

        int contor = 0;

        //folosim do-while pentru cazul in care n == 0 si k == 0

        do{
            int ultima = n % 10;

            if(ultima == k)
            {
                contor++;
            }

            n /= 10;
        }while (n != 0);

        System.out.println(contor);
    }
}
