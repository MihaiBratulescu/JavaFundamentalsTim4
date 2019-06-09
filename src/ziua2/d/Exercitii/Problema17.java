package ziua2.d.Exercitii;

public class Problema17
{
    //Sa se scrie o functie afiseaza
    //toti divizorii numarului
    public static void main(String args[])
    {
        afisareDivizori(123);
    }

    static void afisareDivizori(int nr)
    {
        //12
        //Divizori: 1, 2, 3, 4, 6, 12

        //for 1 -> nr
            //daca numarul se divide la index => este divizor
                //afisam

        for(int i = 1; i <= nr; i++)
        {
            if(nr % i == 0)//divizor
            {
                if(i == nr)//la ultimul divizor
                {
                    System.out.print(i);//afisam fara , in coada
                }
                else
                {
                    System.out.print(i + ", ");
                }
            }
        }
    }
}
