package Homework;

import java.util.Scanner;

public class Tema31
{
//    Se se scrie un program care afiseaza primele n numere divizibile cu
//   23 sau 19


    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);

        int n, contor = 0, start = 19;

        System.out.print("n=");
        n = scanner.nextInt();


        while (contor < n)//daca nu am afisat inca n numere
        {
            if(start % 23 == 0 || start % 19 == 0)//daca respecta conditia
            {
                System.out.println(start);//afisam numeraul
                contor++;//contorizam ca am afisat un numar
            }
            start++;
        }
    }

}
