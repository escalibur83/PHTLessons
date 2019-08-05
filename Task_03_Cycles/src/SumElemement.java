public class SumElemement {
    public static void sumElemementBetweenMinAndMax()
    {

        //генерирум массив и находим минимальное и максимальное число
        int sizeOfMass = 10;
        int max = 0;
        int min = sizeOfMass;
        int myArray[] = new int[sizeOfMass];

        for (int i=0; i<myArray.length; i++)
        {
            int number = (int) (Math.random() * sizeOfMass);
            myArray[i] = number;
            System.out.print(myArray[i] + " ");

            if (max < number)
            {
                max = number = 0;
            } else if (min > number)
            {
                min = number = 9;
            }
        }

        //int[] myArray1 = {0, 2, 9, 8, 0, 4, 9, 1};
        int[] myArray1 = {0, 2, 3, 9, 1, 1, 1, 0, 1, 2, 9};

        int buff = 0;
        for (int i = 0; i < myArray1.length-1; i++) {
            if (myArray1[i+1] != min && myArray1[i+1] != max) {
                while (myArray1[i + 1] != max && myArray1[i + 1] != min) {
                    buff = buff + myArray1[i + 1];
                    i++;
                    continue;
                }
                continue;
            }
        }
        System.out.println("MassSumm: "+buff);
    }
}
