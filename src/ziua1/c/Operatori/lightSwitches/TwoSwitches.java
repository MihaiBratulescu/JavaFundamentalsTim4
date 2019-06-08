package ziua1.c.Operatori.lightSwitches;

public class TwoSwitches
{
    Switch switchA, switchB;
    Light light;

    public void switchLogic()
    {
        /*comantarii
         pe
         mai multe linii*/

        /*if(switchA.isUp())
            light.on();
        else
            light.off();*/

        if(switchB.isUp())
            light.off();
        else
            light.on();
    }

    //Analizam in detaliu ce fac intrerupatoarele

    //Switch A      Switch B    Light
    //up            up          Off
    //up            down        on
    //down          up          on
    //down          down        Off
}
