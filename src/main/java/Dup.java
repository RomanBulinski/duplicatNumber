import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Dup {


    public static String duplicate(int[] numbers){

        List<Integer> temlist = new ArrayList<>();
        String resul = "[";
        Arrays.sort(numbers);

        if(numbers.length == 1){
            resul="[]";
        }else{
            for(int i = 1; i<numbers.length; i++){
                if( numbers[i] == numbers[i-1]  ){
                    temlist.add(numbers[i]);
                }
            }
            for(Integer element :temlist){
                resul = resul + String.valueOf(element)+", ";
            }
            resul = resul.substring(0, resul.length()-2);
            resul = resul+"]";
        }
        return resul;
    }
}
