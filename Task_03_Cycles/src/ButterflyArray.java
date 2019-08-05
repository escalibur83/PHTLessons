public class ButterflyArray {
    public static void butterflyArray ()
    {
        int[][] myArray =  {{1,1,1,1,1},
                            {0,1,1,1,0},
                            {0,0,1,0,0},
                            {0,1,1,1,0},
                            {1,1,1,1,1}};
        for (int i = 0; i<myArray.length; i++) {
            for (int j = 0; j<myArray.length; j++){
                if (myArray[i][j] == 1) {
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}
