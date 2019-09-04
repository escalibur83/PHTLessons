package task_08_Regular;
/*
Написать метод, который проверяет, является ли строка адресом IPv4
4
 */

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IpAdress {

    public boolean ipAdress (String ipAdress)
    {
        Pattern p = Pattern.compile("^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])$");
        Matcher matcher = p.matcher(ipAdress);

        return matcher.find();
    }
}
