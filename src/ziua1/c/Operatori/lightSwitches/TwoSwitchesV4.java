package ziua1.c.Operatori.lightSwitches;

public class TwoSwitchesV4
{
    Switch switchA, switchB;
    Light light;

    public void switchLogic()
    {
        if(switchA.position == switchB.position)
            light.on();
        else
            light.off();
    }

    //Switch A      Switch B    Light
    //up            up          Off
    //up            down        on
    //down          up          on
    //down          down        Off
}
