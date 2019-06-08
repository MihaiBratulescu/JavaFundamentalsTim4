package ziua1.d.Exercitii;

import java.util.Scanner;

public class Problema6 {
    //Sa se citeasca varsta utilizatorului
    //si daca este major primeste de baut alcol
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        int varsta;//rezerv spatiu

        System.out.println("Cati ani ai?");
        varsta = scanner.nextInt();

        if (varsta >= 18)
        {
            System.out.println("Felicitari!!!!");
            System.out.println("Ai primit o bere!");
        }

    }
}
