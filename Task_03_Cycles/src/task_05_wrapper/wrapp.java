package task_05_wrapper;
/*
Определить класс, который при инициализации принимает на
вход 2 аргумента целого или вещественного типа. Задать
перегруженные методы возвращающие результат арифметических операций
над заданными полями и полями типа BigDecimal.
 */

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;

// Как класс может принимать на вход, принимает метод
public class wrapp {
    public static void main (String [] args)
    {
        Number number = new Number(2,3.5, new BigDecimal(435435.00000000555555555555555500000001));
        number.summ(2,3);


    }
}
