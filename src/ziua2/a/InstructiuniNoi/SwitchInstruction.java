package ziua2.a.InstructiuniNoi;

public class SwitchInstruction
{
    public static void main(String args[])
    {
        int nr = 2;
        switch (nr)
        {
            case 1:
            {
                System.out.println("First");
                break;
            }
            case 2:
                System.out.println("Second");
                break;
            case 3:
                System.out.println("Third");
                break;
            default:
                System.out.println("Position " + nr);
        }

        char direction = 'e';
        switch(direction)
        {
            case 'n' :
                System. out . println("You are going north");
                break;
            case 's':
                System. out . println("You are going south");
                break;
            case 'e':
                System. out . println("You are going east");
                break;
            case 'w':
                System. out . println("You are going west");
                break;
            default :
                System. out . println("Bad direction");
        }

        //Supported types
        //char, byte, short, int, an enum , and a String

        //A case constant must evaluate to the same type
        // that the switch expression can use

        //A case constant must be a compile time constant
    }
}
