package task_08_Regular;
/*
Написать программу, выполняющую поиск в строке всех тегов
абзацев, в т.ч. тех, у которых есть параметры, например
<p id ="p1">, и замену их на простые теги абзацев <p>
 */

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.lang.System.*;

public class Tags {

    public void tags (String strAndTags) {
        String f = "";
        Pattern p = Pattern.compile("<\\w>|<\\w\\s\\w.*\\'>");
        Pattern p1 = Pattern.compile("<\\/\\w>");
        Matcher startMatcher = p.matcher(strAndTags);

        StringBuffer stringBuffer1 = new StringBuffer();
        StringBuffer stringBuffer2 = new StringBuffer();
        while (startMatcher.find()) {
            startMatcher.appendReplacement(stringBuffer1,"<p>");
            System.out.println(startMatcher.group());
        }

        startMatcher.appendTail(stringBuffer1);
        f =  stringBuffer1.toString();

        Matcher startMatcher1 = p1.matcher(f);
        while (startMatcher1.find()) {
            startMatcher1.appendReplacement(stringBuffer2,"</p>");
            System.out.println(startMatcher1.group());
        }

        startMatcher1.appendTail(stringBuffer2);
        out.println(stringBuffer2.toString());
    }
}