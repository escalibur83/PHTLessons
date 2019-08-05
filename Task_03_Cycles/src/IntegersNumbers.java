public class IntegersNumbers {

    public static void OutputIntegersNumbers()
    {
        int counter = 100;
        int a = 1;
        int b = 100;
        int[] myArray = new int[counter];
        for (int j = 0; j < counter;)
        {
            int number = a + (int) (Math.random() * b);
            if (number%13 == 0 || number%17 == 0)
            {
                myArray [j] = number;
                System.out.print(myArray [j] + " ");
                j++;
            }
        }
    }
}
