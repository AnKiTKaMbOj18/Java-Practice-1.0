package JavaInterview;

import java.util.HashMap;

public class CharOccuranceCountInString {

    public static void charCount(String str){

        char[] strArr=str.toCharArray();

        HashMap<Character,Integer> charCountMap=new HashMap<>();

        for(char c:strArr){
            System.out.print(c);
            if(charCountMap.containsKey(c)){
                charCountMap.put(c,charCountMap.get(c)+1);
            }else{
                charCountMap.put(c,1);
            }
        }
        System.out.println();
        //printing character map
        System.out.println(charCountMap);

    }
    public static void main(String[] args) {

        String s="javaj2eejava";
        charCount(s);
    }
}
