package ziua2.d.Exercitii;

import java.util.Scanner;

public class Problema2 {
    //Sa se scrie o functie care
    //calculeaza suma a doua nr
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int s;
        s = suma(a, b);

        System.out.println(s);
        System.out.println(suma(5, 2));
    }

    static int suma(int a, int b) {
        return a + b;
    }

}
