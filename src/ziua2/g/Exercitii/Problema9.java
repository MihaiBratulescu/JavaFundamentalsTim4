package ziua2.g.Exercitii;

public class Problema9 {
    //Sa se scrie o functie care
    //afizeaza primele n numere impare
    //folosing continue si break
    public static void main(String args[])
    {
        primeleNumere(3);
    }

    static void primeleNumere(int contor)
    {
        int start = 0;
        while (true)
        {
            start++;
            if(start % 2 == 0)//numar par
            {
                continue;
            }

            System.out.println(start);
            contor--;

            if(contor == 0)
            {
                break;
            }
        }
    }
}
