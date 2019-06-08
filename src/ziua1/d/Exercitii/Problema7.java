package ziua1.d.Exercitii;

import java.util.Scanner;

public class Problema7 {
    //Sa se citeasca varsta utilizatorului
    //si DACA este major primeste de baut alcol
    //ALTFEL daca este minor primeste un suc
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        int varsta;//rezerv spatiu

        System.out.println("Cati ani ai?");
        varsta = scanner.nextInt();

        System.out.println("FELICITARI!!!!");

        if (varsta >= 18)
            System.out.println("Ai primit o bere!");
        else
            System.out.println("Ai primit un suc");
    }
}
