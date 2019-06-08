package ziua1.c.Operatori;

public class OperatoriAsignare
{
    public static void main(String args[])
    {
        int a = 1, b = 1;

        //asignare aceasi valoare in lant
        a = b = 1;
        System.out.println(a);
        System.out.println(b);

        a = a + 2;
        System.out.println(a);

        a += 2;
        System.out.println(a);

        a -= 1;//a = a - 1;
        System.out.println(a);

        a *= 3;
        System.out.println(a);

        a /= 2;
        System.out.println(a);

        //Result impartirii
        b = a % 5;
        System.out.println(b);
        System.out.println(a % 5);

        //Exercise
        //Sa se citeasca 2 numere si sa se calculeze
        //suma, diferenta si media.

        //Homework
        //La fel dar cu 3 numere
    }
}
