package task_03_cycles_and_array;

public class ButterflyArray {

    public static void butterflyArray ()
    {
        int [][] myArray = createButterfly();
        //int[][] myArray =  {{1,1,1,1,1}, {0,1,1,1,0}, {0,0,1,0,0}, {0,1,1,1,0}, {1,1,1,1,1}};
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

    public static int[][] createButterfly(){
        int myArray[][]=new int[5][5];
        int i,j;

        for (i=0;i<myArray.length/2+1;i++){
            for (j=0;j<myArray[i].length;j++){
                if ((j<i) || (j>=(myArray[i].length-i)))
                    myArray[i][j]=0;
                else
                    myArray[i][j]=1;
            }
        }
        for (i=myArray.length-1; i>=myArray.length/2+1; i--){
            for (j=0; j<myArray[i].length; j++){
                if ((j<(myArray[i].length-1-i)) || (j>i))
                    myArray[i][j]=0;
                else
                    myArray[i][j]=1;}
        }
        for (i=0;i<myArray.length;i++){
            for(j=0;j<myArray[i].length;j++){
                System.out.print(myArray[i][j]);
            }
            System.out.println(" ");
        }
        return myArray;
    }
}



