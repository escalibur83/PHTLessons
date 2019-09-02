package Comparable;


import java.text.NumberFormat;
import java.text.ParseException;

public class Apple implements Comparable<Apple>
{
    public int weight;
    public String type;

    public Apple(int weight, String type)
    {
        this.type = type;
        this.weight = weight;
    }

    @Override
    public int compareTo(Apple other)
    {
        int a = getInt(type);
        int b = getInt(other.type);

        if (a > b) {
            return 1;
        }
        if (a < b) {
            return -1;
        } else {
            return 0;
        }
    }

    public static int getInt (String str){
        String something = str;
        int length = something.length();
        String result = "";
        for (int i = 0; i < length; i++)
        {
            Character character = something.charAt(i);
            if (Character.isDigit(character))
            { result += character; }
        }
        return Integer.parseInt(result);
    }
}
