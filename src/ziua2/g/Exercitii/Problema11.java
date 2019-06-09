package ziua2.g.Exercitii;

public class Problema11 {
    //Sa se scrie o functie care
    //afizeaza numerele dintr-un interval

    public static void main(String args[])
    {
        numereDinInterval(3, 9);
    }

    static void numereDinInterval(int start, int end)
    {
        if(start > end)
        {
            //schimbam start si end intre ele
            int tmp = start;
            start   = end;
            end     = tmp;
        }

        for(int i = start; i <= end; i++)
        {
            System.out.println(i);
        }
    }

    static void numerePareDinInterval(int start, int end)
    {
        if(start > end)
        {
            //schimbam start si end fara a treia variabila
            start = start + end;
            end = start - end;
            start = start - end;
        }

        for(int i = start; i <= end; i++)
        {
            if(i % 2 == 0)//este par
            {
                System.out.println(i);
            }
        }
    }

}
