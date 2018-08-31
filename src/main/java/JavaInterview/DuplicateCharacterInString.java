package JavaInterview;

import java.util.HashMap;
import java.util.Set;

public class DuplicateCharacterInString {

    public static void duplicate(String inputString){

        HashMap<Character,Integer> charCountMap=new HashMap<>();

        char[] strArray=inputString.toCharArray();

        for(char c:strArray){
            System.out.println(c);
            if(charCountMap.containsKey(c)){
                //if character is present in charCountMap,incrementing its count by 1
                charCountMap.put(c,charCountMap.get(c)+1);
            }else{
                //if char is not present in charCountMap,
                //putting this to charCountMap with 1 as its value
                charCountMap.put(c,1);
            }
        }

        //Getting a set containing all keys of charCountMap
        Set<Character> charInString=charCountMap.keySet();
        System.out.println("Duplicate characters in "+inputString);

        for(Character ch:charInString){
            if(charCountMap.get(ch)>1){
                //if any character has a count of more than 1 then printing
                System.out.println(ch+" : "+charCountMap.get(ch));
            }
        }
    }

    public static void main(String[] args) {

        duplicate("ankit kamboj");
        duplicate("abc cba");

    }
}
