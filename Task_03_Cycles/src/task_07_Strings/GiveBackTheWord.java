package task_07_Strings;

public class GiveBackTheWord {

    public boolean word (String word, String str)
    {
        boolean check = false;
        String word1 = word;
        String str1 = str;
        String replace= str1.replace(" ", "");
        boolean isStart = str1.startsWith(word, 0);
        boolean isEnd = str1.endsWith(word);

        if (isStart ==true && isEnd == true)
        {
            return check = true;
        } else {
            return check = false;
        }
    }
}
