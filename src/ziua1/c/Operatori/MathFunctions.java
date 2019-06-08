package ziua1.c.Operatori;

public class MathFunctions
{
    public static void main(String args[])
    {
        // Numerous math functions
        System.out.println("abs(-1) = " + Math.abs(-1));
        System.out.println("ceil(4.25) = " + Math.ceil(4.25));
        System.out.println("floor(4.25) = " + Math.floor(4.25));
        System.out.println("round(4.25) = " + Math.round(4.25));
        System.out.println("max(4,5) = " + Math.max(4, 5));
        System.out.println("min(4,5) = " + Math.min(4, 5));
        System.out.println("exp(1) = " + Math.exp(1));
        System.out.println("log(1) = " + Math.log(1));
        System.out.println("log10(1) = " + Math.log10(1));
        System.out.println("pow(2,2) = " + Math.pow(2, 2));
        //square root
        System.out.println("sqrt(4) = " + Math.sqrt(4));
        //cubic root
        System.out.println("cbrt(4) = " + Math.cbrt(4));
        System.out.println("hypot(5,5) = " + Math.hypot(5, 5));
        System.out.println("PI = " + Math.PI);

        // Trig Functions Radians
        System.out.println("sin(1.5708) = " + Math.sin(1.5708));
        System.out.println("cos(1.5708) = " + Math.cos(1.5708));
        System.out.println("tan(1.5708) = " + Math.tan(1.5708));
        System.out.println("asin(1.5708) = " + Math.asin(1.5708));
        System.out.println("acos(1.5708) = " + Math.acos(1.5708));
        System.out.println("atan(1.5708) = " + Math.atan(1.5708));
        System.out.println("sinh(1.5708) = " + Math.sinh(1.5708));
        System.out.println("cosh(1.5708) = " + Math.cosh(1.5708));
        System.out.println("tanh(1.5708) = " + Math.tanh(1.5708));
        System.out.println("toDegrees(1.5708) = " + Math.toDegrees(1.5708));
        System.out.println("toRadians(90) = " + Math.toRadians(90));

        // Random number (0-1)
        System.out.println("Rand : " + Math.random());

        // Random number between 5 and 20
        int minNum = 5;
        int maxNum = 20;
        int randNum = minNum + (int)(Math.random() * ((maxNum - minNum) + 1));
        System.out.println("Rand [5-20]: "+ randNum);
    }
}
