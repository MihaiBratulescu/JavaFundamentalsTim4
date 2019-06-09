package ziua2.c.Functii;

public class VariableScope
{
    //scope == spread && scope == extent
    //scope == intindere && scope == arie

    //The scope of a variable is the part of
    // the code in which you can access it

    /*
    • local they live as long as their method remains on the stack
    • block live only as long as the code block is executing
    */

    public static void main(String args[])
    {
        int x;

        //float x;
        //int x;

        {
            int a;
            //int x;
        }

        int a = 2;

        int p = 5;
        function(p);
        System.out.println(p);//5
    }

    public static void myFunction()
    {
        //x = 2;
    }

    public static void function(int n)
    {
        n = n + 1;
    }
}
