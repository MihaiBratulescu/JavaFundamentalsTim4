package ziua2.d.Exercitii;

public class Problema3
{
    //Sa se scrie o functie care returneaza
    //maximul dintre doua numere
    public static void main(String args[])
    {
        float m = maxim(5, 3.9f);

        System.out.println(m);
        System.out.println(esteAMaxim(5, 3));
        System.out.println(esteAMaxim(5, 31));
    }

    static float maxim(int a, float b)
    {
//        if(a > b)
//        {
//            return a;
//        }
//        else
//        {
//            return b;
//        }

        //inline-if
        return a > b ? a : b;
    }

    static boolean esteAMaxim(int a, int b)
    {
//        if(a > b)
//        {
//            return true;
//        }
//        else
//        {
//            return false;
//        }
        return a > b;
    }
}
