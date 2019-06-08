package ziua1.c.Operatori.lightSwitches;

public class ThreeSwitchesV4
{
    Switch switchA, switchB, switchC;
    Light light;

    //Switch A      Switch B    Switch C    Light
    //F             F           F           F
    //F             F           T           T
    //F             T           F           T
    //F             T           T           F
    //-------------------------------------------------
    //T             F           F           T
    //T             F           T           F
    //T             T           F           F
    //T             T           T           T

    //A     B       A ^ C (xor) (exclusive-or)
    //--------------------
    //F     F       F
    //T     F       T
    //F     T       T
    //T     T       F

    //DeMorgan Law
    //!(A && B) == !A || !B
    //!(A || B) == !A && !B


    public void switchLogic()
    {
        boolean a = switchA.isUp();
        boolean b = switchB.isUp();
        boolean c = switchC.isUp();

        if(!a && (b ^ c) ||
            a && !(b ^ c))
            light.on();
        else
            light.off();
    }

}
