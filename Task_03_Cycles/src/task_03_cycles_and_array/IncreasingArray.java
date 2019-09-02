package task_03_cycles_and_array;

public class IncreasingArray {
    public static void increasingArray()
    {
        int counter = 3;
        boolean flag = false;

        int[] myArray = new int[counter];

        for (int j = 0; j < counter; j++) {
            int number = (int) (Math.floor(Math.random() * 99) + 10);
            myArray [j] = number;
            System.out.print(myArray [j] + " ");
        }

        for (int j = 0; j< myArray.length-1;)
        {
            if (myArray[j] < myArray[j+1]) {
                flag = true;
            }else {
                flag = false;
                break;
            }
            j++;
        }

        if (flag == true)
        {
            System.out.println("Массив строго возрастающий");
        }
    }
}
