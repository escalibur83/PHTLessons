package task_07_Strings;

public class MyName {

    public void MyName(String firstName, String lastName, String thirdName)
    {
        char firstCh = firstName.charAt(0);
        char lastCh = lastName.charAt(0);
        char thirdCh = thirdName.charAt(0);


        System.out.println (Character.toUpperCase(firstCh) +". "+ Character.toUpperCase(lastCh) +". "+ Character.toUpperCase(thirdCh)+".");
    }
}