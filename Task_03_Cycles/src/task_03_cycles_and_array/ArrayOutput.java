package task_03_cycles_and_array;

public class ArrayOutput {

    static int[] myArray = new int[] {10, 11, 12, 13, 14, 15, 16, 17, 18, 19}; //mass

    public static void arrayOutputForward()
    {
        System.out.println("arrayOutputForward");
        for (int i = 0; i < myArray.length; i++)
        {
            System.out.print(myArray [i] + " ");
        }
        System.out.println("");
    }

    public static void arrayOutputBackwards()
    {
        System.out.println("arrayOutputBackwards");
        for (int i = myArray.length-1; i>=0; i--)
        {
            System.out.print(myArray [i] + " ");
        }
        System.out.println("");
    }
}
