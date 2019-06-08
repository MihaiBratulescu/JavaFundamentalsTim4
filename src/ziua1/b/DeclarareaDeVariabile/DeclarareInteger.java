package ziua1.b.DeclarareaDeVariabile;

public class DeclarareInteger
{
    public static void main(String args[])
    {
        //In baza 10: (0-9)
        int b10;

        b10 = 123;
        b10 = -564;
        b10 = 10__000___00;
        b10 = 1_000_000;

        //In baza 8: (0-7)
        int b8;

        b8 = 0123;
        b8 = -044;
        b8 = 01_00;
        //gresit
        //b8 = 08;
        //b8 = 09;

        //In baza 16: (0-F) (hexadecimal)
        int b16;

        b16 = 0x123;
        b16 = 0X123;
        b16 = 0x55_99;
        b16 = -0xA54FF;
        b16 = 0xCAFEBABE;
        b16 = 0xDEAD_C0DE;
        //gresit
        //b16 = 0xGHJ;

        //In baza 2: (0-1) (binar)
        int b2;

        b2 = 0b11001;
        b2 = 0B11001;
        b2 = 0b11_001;
        b2 = -0b010110;
        //gresit
        //b2 = 0b2;
    }
}
