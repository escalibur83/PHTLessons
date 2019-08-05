public class Factoreal {
    static int number = 3;

    public static void factorialAndWhile()
    {
        int factorial = 1;
        int i = 1;
        while (i <= number)
        {
            factorial *= i;
           i++;
        }
        System.out.println(factorial + " Calculated using While");
    }

    public static void factorialAndFor()
    {
        int factorial = 1;
        for (int i = 1; i <=number; i ++){
            factorial *= i;
        }
        System.out.println(factorial + " Calculated using FOR");
    }
}