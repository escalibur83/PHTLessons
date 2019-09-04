package task_08_Regular;
/*
Написать программу, проверяющую, является ли введённая строка адресом
электронногопочтового ящика.
В названии почтового ящика разрешить использование только
букв, цифр и нижних подчёркиваний, при этом оно должно
начинаться с буквы.
Возможные домены верхнего уровня: .org .com
 */

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckDomain {

    public void checkDomain (String domain)
    {
        Pattern p = Pattern.compile("^([\\w-\\.]+){1,64}@([\\w&&[^_]]+){2,255}.[a-z]{2,}$");
        Matcher matcher = p.matcher(domain);
        if (matcher.find()){
            System.out.println(domain + " true");
        } else {
            System.out.println(domain + " false");
        }
    }
}
