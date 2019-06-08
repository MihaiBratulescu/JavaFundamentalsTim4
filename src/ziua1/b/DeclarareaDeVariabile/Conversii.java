package ziua1.b.DeclarareaDeVariabile;

public class Conversii
{
    public static void main(String args[])
    {
        byte b = 120;
        short s = 42;

        System.out.println((int)b);


        //Nu intra short(16 biti) in
        // byte (8 biti)
        //b = s;

        s = b;

        char c = 14;
        int i = 925566698;

        float f = i;
        System.out.println(f);

        int i1 = 3, i2 = 2;

        System.out.println((float) i1/i2);
    }
}
