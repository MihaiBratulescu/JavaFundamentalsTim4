package Homework;

import java.util.Scanner;

public class Tema27
{
//    Sa se citeasca un String doar cu caractere din alfabet.
//    Sa se determine daca toate caracterele au acelasi case.
//        (toate litere mari sau toate litere mici)

    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);

        String s;

        System.out.println("s = ");
        s = scanner.next();

        if(auAcelasiCase(s))
        {
            System.out.println("au acelasi case");
        }
        else
        {
            System.out.println("NU au acelasi case");
        }
    }

    static boolean auAcelasiCase(String s)
    {
        char c = s.charAt(0);
        boolean primulEsteUpperCase = Character.isUpperCase(c);//memoram ce case are primul caracter

        for(int i = 1; i < s.length(); i++)
        {
            char tmp = s.charAt(i);
            if(Character.isUpperCase(tmp) != primulEsteUpperCase)//verificam daca caracterul de la pozitia i
                //are case diferit de primul caracter
            {
                return false;
            }
        }

        //daca am ajuns aici, nu am gasit un caracter cu case diferit de primul
        return true;
    }
}
