public class Equals {
    public static void equalsMassNumber()
    {
        int[][] myArray =  {{1,3,7,1,8}, {0,1,7,1,8}};

        for (int i = 0; i<myArray.length-1; i++)
        {
            for (int j = 0; j<5; j++)
            {
                if (myArray[i][j] == myArray[i+1][j]) {
                    System.out.print("the same: "+ myArray[i][j]+" ");
                }
            }
        }
    }
}