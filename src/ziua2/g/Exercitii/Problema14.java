package ziua2.g.Exercitii;

public class Problema14
{
    //Sa se scrie o functie care transforma
    //un caracter din litera mica in litera mare
    public static void main(String args[])
    {
        char upper = toUpperCase('2');

        System.out.println(upper);//A
    }

    static char toUpperCase(char c)
    {
        if(esteLiteraMica(c))
        {
            return convertesteInLiteraMare(c);
        }

        return c;
    }

    static char convertesteInLiteraMare(char c)
    {
        return (char)((int)c - 32);
    }

    static boolean esteLiteraMica(char c)
    {
        return 97 <= c && c <= 122;
    }
}
