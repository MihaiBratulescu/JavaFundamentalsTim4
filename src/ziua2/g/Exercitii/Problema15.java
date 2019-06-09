package ziua2.g.Exercitii;

public class Problema15
{
    //Sa se scrie o functie care numara cate vocale sunt
    //intr-un String
    public static void main(String args[])
    {
        String s = "abc";

        System.out.println(s.charAt(0));//a
        System.out.println(s.charAt(1));//b
        System.out.println(s.charAt(2));//c
        //Index Out of Bounds
        //System.out.println(s.charAt(3));

        int nrDeVocale = nrVocale(s);
        System.out.println(nrDeVocale);
    }

    static int nrVocale(String s)
    {
        //s.length()  -> lungimea sirului
        //s.charAt(3) -> caracterul de la poziita 3

        int contor = 0;

        for(int i = 0; i < s.length(); i++)
        {
            char c = s.charAt(i);

            if(esteVocala(c))
            {
                contor++;
            }
        }

        return contor;
    }

    static boolean esteVocala(char c)
    {
        return c == 'a' || c == 'e' ||
                c == 'i' || c == 'o' ||
                c == 'u';
    }

}
