package ziua1.b.DeclarareaDeVariabile;

public class DeclarareFloatingPoint
{
    public static void main(String args[])
    {
        float f;

        f = 123.43f;
        f = 123.43F;
        f = -85.33f;
        f = 77.0f;
        f = 77f;

        double d;

        d = 123.33d;
        d = 123.33D;
        d = 123.33;//d is redundant
        d = 123;//d is redundant

        //Scientific notation
        double thousand;
        thousand = 1e+3;
        thousand = 1e3;
        System.out.println(thousand);
    }
}
