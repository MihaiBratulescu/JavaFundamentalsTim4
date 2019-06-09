package ziua2.a.InstructiuniNoi;

import java.util.Locale;

public class StringInterpolation
{
    public static void main(String args[])
    {
//        s – formats strings
//        d – formats decimal integers
//        f – formats the floating-point numbers
//        t – formats date/time values
//        h - hexa

        String f = "Hello %s, %s";

        //cod
        String tmp = String.format(f, "John", "Doe");
        //cod
        tmp = String.format(f, "Ion", "Popica");
        //cod

        System.out.printf("%s", "John");
        System.out.println();
        System.out.printf("%s %s", "John", "Doe");
        System.out.println();
        System.out.printf("%s <-> %s",
                "John", "Doe");
        System.out.println();

        //minimum length
        System.out.printf("\"%10s\"", "John");
        System.out.println();
        System.out.printf("\"%-10s\"", "John");
        System.out.println();

        System.out.printf("%b", false);
        System.out.println();
        System.out.printf("%B", true);
        System.out.println();

        System.out.printf("%C", 'a');
        System.out.println();
        System.out.printf("%c", 45);
        System.out.println();

        System.out.printf(Locale.US,"%,d", 10000);
        System.out.println();
        System.out.printf(Locale.ITALY, "%,d", 10000);
        System.out.println();

        System.out.printf("%f", 5.1473);
        System.out.println();
        System.out.printf("%.3f", 5.1473);
        System.out.println();
        System.out.printf("'%8.2f'", 1234.1473);
        System.out.println();

        System.out.printf("%h", 1002);
        System.out.println();
    }
}
