package JavaInterview;

public class MaximumOfArray {

    public static void maxArray(int[] num){

        int max=num[0];
        int min=num[0];
        for(int i=0;i<num.length;i++){
            if(num[i]>max){
                max=num[i];
            }
            if(num[i]<min){
                min=num[i];
            }
        }
        System.out.println("maximum among array is: "+max);
        System.out.println("minimum among array is: "+min);
    }

    public static void main(String[] args) {

        int[] number={1,2,3,4,5,6,9,8,7};

        maxArray(number);
    }
}
