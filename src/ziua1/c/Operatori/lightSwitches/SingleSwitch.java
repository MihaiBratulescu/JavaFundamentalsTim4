package ziua1.c.Operatori.lightSwitches;

public class SingleSwitch
{
    Switch switchA;
    Light light;

    public void switchLogic()
    {
        if(switchA.isUp())
            light.on();
        else
            light.off();
    }
}
