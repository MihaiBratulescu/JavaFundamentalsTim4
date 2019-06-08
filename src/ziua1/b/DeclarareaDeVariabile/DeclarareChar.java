package ziua1.b.DeclarareaDeVariabile;

import static java.lang.System.*;

public class DeclarareChar
{
    public static void main(String args[])
    {
        char c;

        c = 1001;//pozitia din tabelul ASCII
        out.println(c);

        c = 'a';
        out.println(c);

        //Ghilimea simpla
        c = '\'';
        out.println(c);

        //Backslash
        c = '\\';
        out.println(c);

        //Ghilimea dubla
        c = '"';
        out.println(c);
        c = '\"';
        out.println(c);

        //linefeed (rand nou)
        c = '\n';
        out.print(c);//<--print

        //tab
        c = '\t';
        out.println(c);//<--print

        //Unicode (\u0000 - \uFFFF)
        c = '\uF29D';
        out.println(c);

    }
}
