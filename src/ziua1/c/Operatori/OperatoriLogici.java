package ziua1.c.Operatori;

public class OperatoriLogici
{
    public static void main(String args[])
    {
        int a = 6, b = 5;

        //AND (si)
        System.out.println(a == 4 && b == 5);

        //OR (sau)
        System.out.println(a % 2 == 0 || b % 2 == 0);

        //! (negare)
        System.out.println(!(a % 2 == 0));//par
        System.out.println(a % 2 != 0);//impar
        System.out.println(!(a == 4 && b == 5));
    }
}
