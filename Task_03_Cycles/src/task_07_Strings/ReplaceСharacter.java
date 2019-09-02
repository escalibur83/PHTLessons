package task_07_Strings;

public class ReplaceСharacter {

    public void replaceСharacter (String str)
    {
        String[] strings = {str};
        String regex = "(?i)([a-z])\\1{2,}";
        for (String string : strings) {
            System.out.println(string.replaceAll(regex, "$1"));
        }
    }
}
