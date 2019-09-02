package task_07_Strings;

public class WordCalculate {

    public int wordCalculate (String s)
    {
        int counter=0;
        for(int i=0;i<=s.length()-1;i++){
            if(Character.isLetter(s.charAt(i))){
                counter++;
                for(;i<=s.length()-1;i++){
                    if(s.charAt(i)==' '){
                        i++;
                        break;
                    }
                }
            }
        }
        return counter;
    }
}
