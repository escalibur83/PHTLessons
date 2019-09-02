package task_03_cycles_and_array;

public class DetectNumber {
    public static void detectSimplifiedNumber()
    {
        int number = 67;

        boolean flag = false;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                flag = true;
                break;
            }
        }
        if (flag)
            System.out.println(number+ " The number is not a natural number.");
        else
            System.out.println(number+ " The number is a natural number.");
    }
}