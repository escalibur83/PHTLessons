public class DetectNumber {
    public static void detectSimplifiedNumber()
    {

        int number = 17;

        boolean flag = true;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                flag = false;
                break;
            }
        }
        if (flag)
            System.out.println(number+ " The number is a natural number.");
        else
            System.out.println(number+ " The number is not a natural number.");
    }
}
