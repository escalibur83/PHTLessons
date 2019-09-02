package task_03_cycles_and_array;

public class Main {
    public static void main (String [] args)
    {
        /*
        1. Напишите программу, которая печатает массив сначала в обычном порядке, затем в обратном.
         */
        System.out.println("Task_1");
        ArrayOutput.arrayOutputForward();
        ArrayOutput.arrayOutputBackwards();

        /*
        Напишите программу, заносящую в массив первые 100 натуральных чисел, делящихся на 13 или на 17, и печатающую его.
         */
        System.out.println("Task_2");
        IntegersNumbers.OutputIntegersNumbers();

        /*
        Определить сумму элементов целочисленного массива, расположенных между ближайшими минимальным и максимальным значениями,
        не включая минимальное и максимальное значение.
0 2 3 9 -> 5
0 2 3 9 1 1 1 0 1 2 9 -> 2+3+1+2=8
0 2 9 8 0 4 9 -> 2+4= 6
         */
        System.out.println("");
        System.out.println("Task_3");
        SumElemement.sumElemementBetweenMinAndMax();
        //Spizzeno.spizzeno();

        /*
        Создать массив из 3 случайных целых чисел из отрезка [10;99], вывести его на экран в строку. 
   Определить и вывести на экран сообщение о том, является ли массив строго возрастающей последовательностью.
         */
        System.out.println("Task_4");
        IncreasingArray.increasingArray();

        /*
        Создать двухмерный квадратный массив, и заполнить его "бабочкой", т.е. таким образом:

1 1 1 1 1
0 1 1 1 0
0 0 1 0 0
0 1 1 1 0
1 1 1 1 1

Вывести его на экран, заменив 1 символом *, а 0 - пробелом.
         */
        System.out.println("");
        System.out.println("Task_5");
        ButterflyArray.butterflyArray();

        /*
        6. Написать метод equals, который определяет, равны ли между собой соответствующие элементы 
2-х двумерных массивов.
         */
        System.out.println("");
        System.out.println("Task_6");
        Equals.equalsMassNumber();

        /*
        Написать программу, эмулирующую выдачу случайной карты из колоды в 52 карты.
      Вывести результат в формате "Карта of Масть". Например, "AceofSpades".
      Валет - Jack, Дама - Queen, Король - King, Туз - Ace, Червы - Hearts, Пики - Spades, Трефы - Clubs, Бубны - Diamonds
         */
        System.out.println("");
        System.out.println("Task_7");
        System.out.println(PlayingCard.playingCard52());

        /*
        8.* Написать программу, перемешивающую и печатающую список карт в колоде.
      Воспользоваться результатом предыдущей задачи.
         */
        System.out.println("");
        System.out.println("Task_8");
        StirrerCard.stirrerCard();

        /*
        9. Имеется целое число, определить является ли это число простым, т.е. делится без остатка только на 1 и себя.
         */
        System.out.println("Task_9");
        DetectNumber.detectSimplifiedNumber();

        /*
        Написать алгоритм расчета факториала , используя циклы (for и while).
         */
        System.out.println("");
        System.out.println("Task_10");
        Factoreal.factorialAndWhile();
        Factoreal.factorialAndFor();
    }
}