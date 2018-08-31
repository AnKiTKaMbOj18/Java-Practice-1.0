package JavaInterview;

import java.util.Arrays;

public class ArraysEquality {

    public static void main(String[] args) {

        //using Iterative method
        System.out.println("Using Iterative method: ");
        int[] arr1={1,2,3,4,5};
        int[] arr2={1,3,5,7,9};

        boolean equalOrNot=true;

        if(arr1.length==arr2.length){

            for(int i=0;i<arr1.length;i++){

                if(arr1[i]!=arr2[i]){
                    equalOrNot=false;
                }
            }
        }
        else{
            equalOrNot=false;
        }
        if(equalOrNot){
            System.out.println("Arrays are equal");
        }else{
            System.out.println("Arrays are not equal");
        }

        //using equals method
        System.out.println("Using Arrays.equals(a,b) method: ");

        String[] str1={"abc","abc","abc","abc"};
        String[] str2={"abc","abc","abc","abc"};

        if(Arrays.equals(str1,str2)){
            System.out.println("Arrays are equal");
        }else{
            System.out.println("Arrays are not equal");
        }
    }
}
