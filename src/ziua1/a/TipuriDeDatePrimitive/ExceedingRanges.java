package ziua1.a.TipuriDeDatePrimitive;

public class ExceedingRanges
{
    public static void main(String args[])
    {
        System.out.println(Byte.MAX_VALUE + 1 == Byte.MIN_VALUE);
        System.out.println(Byte.MIN_VALUE - 1 == Byte.MAX_VALUE);

        System.out.println(Short.MAX_VALUE + 1 == Short.MIN_VALUE);
        System.out.println(Short.MIN_VALUE - 1 == Short.MAX_VALUE);

        System.out.println(Integer.MAX_VALUE + 1 == Integer.MIN_VALUE);
        System.out.println(Integer.MIN_VALUE - 1 == Integer.MAX_VALUE);

        System.out.println(Long.MAX_VALUE + 1 == Long.MIN_VALUE);
        System.out.println(Long.MIN_VALUE - 1 == Long.MAX_VALUE);
    }
}
