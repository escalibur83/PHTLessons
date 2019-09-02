package task_07_Strings;

public class NumbToStr {
    public String numbToStr(int numb)
    {
        int length = (int)(Math.log10(numb)+1);

        if (length<10)
        {
            StringBuilder add = new StringBuilder();
            for (int i = 0; i<(10-length); i++)
            {
                add.append("0");
            }
            String str = Integer.toString(numb);

            return add+str;
        }else {
            return "0000000000";
        }
    }
}