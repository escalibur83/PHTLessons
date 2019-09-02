package task_07_Strings;

public class Main {
    public static void main (String [] args){

        /*
        Написать два цикла, выполняющих многократное сложение строк, один с помощью оператора сложения и String,
        второй с помощью StringBuilder и метода append. Сравнить скорость их выполнения
        */
        SimpleSpeed simpleSpeed = new SimpleSpeed();
        FastSpeed fastSpeed = new FastSpeed();
        System.out.println(simpleSpeed.simpleString());
        System.out.println(fastSpeed.fastSpeed());

        /*
        Заменить все грустные смайлы
         */
        Smile smile = new Smile();
        smile.smile("I will be back :(");

        /*
        Написать функцию, принимающую 2 параметра: строку и слово - и возвращающую true, если строка начинается и заканчивается этим словом.
         */
        GiveBackTheWord giveBackTheWord = new GiveBackTheWord();
        boolean res = giveBackTheWord.word("qwert", "qwert rerer eerte qwert");
        System.out.println("Начинается и заканчивается одним словом: " + res);

        /*
        Написать функцию, принимающую в качестве параметров имя, фамилию и отчество и возвращающую инициалы
        в формате "Ф.И.О". Учесть, что входные параметры могут быть в любом регистре, а результирующая строка должна быть в верхнем.
         */
        MyName myName = new MyName();
        myName.MyName("reg", "natlo", "uerd");

        /*
        Подсчитать количество слов в тексте. Учесть, что слова могут разделяться несколькими пробелами.
         */
        WordCalculate wordCalculate = new WordCalculate();
        System.out.println("количество слов в тексте: " + wordCalculate.wordCalculate("qwert rerer eerte yyuu uuu qwert"));

        /*
        Написать функцию, заменяющую несколько последовательных одинаковых символов в строке одним
         */
        ReplaceСharacter replaceСharacter = new ReplaceСharacter();
        replaceСharacter.replaceСharacter("hhhhhheeeeeeeyyyyyyyyy");

        /*
        Написать функцию, принимающую на вход целое число, возвращающую строку из 10 символов, дополненных слева нулями.
        Если число выходит за размер 10 символов вернуть все нули.
        Пример getString (22) -> 0000000022
        Найти 3 способа решения задачи и определить наиболее быстрый способ
         */
        NumbToStr numbToStr = new NumbToStr();
        System.out.println (numbToStr.numbToStr(12345));
    }
}