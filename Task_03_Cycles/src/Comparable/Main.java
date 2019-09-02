package Comparable;

import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;

public class Main
{
    public static void main (String [] args)
    {
        int money = 130;
        int[] nominal = {20, 50, 100}; //массив имеющихся купюр
        int[] count = new int[nominal.length]; //кол-во купюр выдать
        int index = nominal.length - 1;

        while (index != -1)
        {
            int NominalValue = nominal[index];
            count[index] = money / NominalValue;
            int NewMoney = money % NominalValue;
            money = NewMoney;
            index--;
        }



        ArrayList<Apple> box = new ArrayList<Apple>();
        for (int i=0; i<100; i++)
        {
            int randoWeight = 0 + (int) (Math.random() * 100);
            Apple apple = new Apple(randoWeight, "page_"+randoWeight);
            box.add(apple);
        }
        Collections.sort(box);

        for (int i=0; i<100; i++)
        {
            Apple apple = box.get(i);
            System.out.println("Apple " + apple.weight + ", name: "+ apple.type);
        }
    }
}
