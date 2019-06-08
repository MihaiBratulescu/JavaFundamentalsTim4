package ziua1.c.Operatori.lightSwitches;

public class TwoSwitchesV2
{
    Switch switchA, switchB;
    Light light;

    public void switchLogic()
    {
        light.off();

        if(switchA.isUp() && switchB.isUp())
            light.on();

        if(switchA.isDown() && switchB.isDown())
            light.on();
    }

    //Switch A      Switch B    Light
    //up            up          on
    //up            down        Off
    //down          up          off
    //down          down        on
}
