package task_07_Strings;

public class SimpleSpeed {

    public long simpleString (){

        long start = System.nanoTime();
        for (int i = 0; i < 1000; i++)
            {
                System.out.print(i);
            }
        System.out.println("");
        long end = System.nanoTime();
        return end - start;
    }
}
