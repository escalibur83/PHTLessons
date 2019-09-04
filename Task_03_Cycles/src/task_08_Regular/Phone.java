package task_08_Regular;
/*
Написать программу, выполняющую поиск в строке мобильных
телефонных номеров в формате
+375XXYYYYYYY и заменяющую каждый телефон на тот же, но в формате
+375 (XX) YYY-YY-YY
 */

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Phone {
    public void phone (String phone) {
        Pattern p = Pattern.compile("\\+?[375]-?[0-9{9}]+");
        Matcher matcher = p.matcher(phone);
        if (matcher.find()){
            System.out.println(matcher.group() + " true");
            String findPhone = matcher.group();

            String newPhone = "(\\+\\d{3})(\\d{2})(\\d{3})(\\d{2})(\\d{2})";
            Pattern pattern = Pattern.compile(newPhone);
            Matcher matcher1 = pattern.matcher(findPhone);
            StringBuffer stringBuffer = new StringBuffer();
            while (matcher1.find()) {
                matcher1.appendReplacement(stringBuffer, "$1 ($2) $3-$4-$5");
            }
            matcher1.appendTail(stringBuffer);
            System.out.println("Replace: " + stringBuffer.toString());

        } else {
            System.out.println("Phone Number is not available");
        }
    }
}