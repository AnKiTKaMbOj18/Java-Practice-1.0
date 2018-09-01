package JavaInterview;

import java.util.HashSet;

public class CommonAmongTwoArray {

    public static void main(String[] args) {

        String[] str1={"abc","def","ghe","ijk"};
        String[] str2={"lmn","opq","abc","rst","ghe"};

        HashSet<String> set=new HashSet<>();

        for(int i=0;i<str1.length;i++){

            for(int j=0;j<str2.length;j++){

                if(str1[i].equals(str2[j])){
                    set.add(str1[i]);
                }
            }
        }
        System.out.println("Common elements between ArrayList's are: "+set);
    }
}
