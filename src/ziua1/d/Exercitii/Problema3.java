package ziua1.d.Exercitii;

import java.util.Scanner;

public class Problema3
{
    //Sa se citeasca numele utilizatorului
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);

        String nume;

        {
            System.out.println("Cum te cheama?");
            nume = scanner.next();

            System.out.println("Hello " + nume);
        }
    }
}
