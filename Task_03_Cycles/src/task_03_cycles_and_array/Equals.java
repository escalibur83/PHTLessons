package task_03_cycles_and_array;

import java.awt.*;
import java.util.Arrays;

public class Equals {
    public static void equalsMassNumber()
    {
        int[][] myArray =  {{1,3,7,1,8}, {0,1,7,1,8}};
        int[][] myArray2 = {{1,2,7,1,8}, {0,1,7,1,8}};

        for (int i = 0; i<myArray.length-1; i++)
        {
            for (int j = 0; j<5; j++)
            {
                if (myArray[i][j] == myArray[i+1][j]) {
                    System.out.print("the same: "+ myArray[i][j]+" ");
                }
            }
        }

        boolean check = Arrays.deepEquals(myArray, myArray2);
        if (check == true)
        {
            System.out.println("Mass same");
        } else {
            System.out.println("Mass No same");
        }
    }
}