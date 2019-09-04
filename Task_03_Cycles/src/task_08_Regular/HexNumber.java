package task_08_Regular;
/*
Написать программу, выполняющую поиск в строке
шестнадцатеричных чисел, записанных по правилам Java,
с помощью регулярных выражений и выводящую их на страницу
 */

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HexNumber {
    public void hexNumber (String number)
    {
        Pattern p = Pattern.compile("0x-?[0-f]+");
        Matcher matcher = p.matcher(number);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}