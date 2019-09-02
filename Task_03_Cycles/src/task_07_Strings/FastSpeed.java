package task_07_Strings;

public class FastSpeed {

    public long fastSpeed()
    {
        long start = System.nanoTime();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 1000; i++)
        {
            sb.append(i);
        }
        System.out.println(sb);
        long end = System.nanoTime();
        return end - start ;
    }
}
