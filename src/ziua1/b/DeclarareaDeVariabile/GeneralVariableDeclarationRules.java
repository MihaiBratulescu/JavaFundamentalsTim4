package ziua1.b.DeclarareaDeVariabile;

import static java.lang.System.*;

public class GeneralVariableDeclarationRules
{
    //A variable name must BEGIN with a letter and must be
    // a sequence of letters or digits.

    //A letter is defined as 'A'–'Z', 'a'–'z', '_', '$'
    //or any Unicode character that denotes a letter in a language.

    //Similarly, digits are '0'–'9' and any Unicode characters
    // that denote a digit in a language.

    //The first letter SHOULD be lowercase, and then normal
    //NumarulDeCursanti - Pascal Case
    //numarulDeCursanti - Camel Case
    //CamelCase rules should be used.

    //All characters in the name of a variable
    //are significant and case is also significant.

    public static void main(String args[])
    {
        //Declarare de variabile (general)
        int a;         //declarare
        a = 3;         //initializare
        System.out.println(a);//afisare

        int b = 5;//declarare cu initializare

        //declarare multipla
        int x, y = 7, z;

        //Care este valoarea daca nu initializam?
        //Zero! Dar...
        int defaultValue;
        //out.println(defaultValue);
    }
}
