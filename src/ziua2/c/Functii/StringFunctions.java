package ziua2.c.Functii;

public class StringFunctions
{
    public static void main(String args[])
    {
        String s = "  AbCdEf  ";

        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());
        System.out.println(s.isEmpty());
        System.out.println(s.length());
        System.out.println(s.charAt(0));
        //indexOf - if not found returns -1
        System.out.println(s.indexOf('c'));
        System.out.println(s.startsWith("A"));
        System.out.println(s.endsWith("F"));
        System.out.println(s.trim());
        System.out.println(s.substring(3, 5));
        System.out.println(s.replace('C', '5'));

        s = s.replace('C', '5');
        s = s + "test";

        System.out.println(s);
    }
}
