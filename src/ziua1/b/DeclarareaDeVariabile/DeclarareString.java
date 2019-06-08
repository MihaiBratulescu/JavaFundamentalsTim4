package ziua1.b.DeclarareaDeVariabile;

public class DeclarareString
{
    public static void main(String args[])
    {
        String s = "Ana are mere si face o placinta";
        System.out.println(s);

        //backspace
        System.out.println("Hello\b");

        //carriage return
        System.out.println("Ana \n are mere\r.");

        //Concatenare String-uri
        System.out.println("Hello " + "World");

        System.out.println("Your number is: " + 3.14f);

        //Atentie la operatii numerice
        System.out.println(("Sum: " + 3) + 5);
        System.out.println(("Sum: 3") + 5);
        System.out.println("Sum: 35");

        System.out.println("Sum: " + (3 + 5));
        System.out.println("Sum: " + (8));

    }
}
