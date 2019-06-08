package ziua1.c.Operatori.lightSwitches;

public class ThreeSwitches
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

    public void switchLogic()
    {
        if(switchA.isDown() && switchB.isDown() && switchC.isUp() ||
                switchA.isDown() && switchB.isUp() && switchC.isDown() ||
                switchA.isUp() && switchB.isDown() && switchC.isDown() ||
                switchA.isUp() && switchB.isUp() && switchC.isUp())
            light.on();
        else
            light.off();
    }

}
