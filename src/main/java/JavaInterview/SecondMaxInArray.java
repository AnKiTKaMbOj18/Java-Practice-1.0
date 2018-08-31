package JavaInterview;

public class SecondMaxInArray {

    public static void maxArray(int[] num){

        int max=num[0];
        int max2=num[1];
        int min=num[0];
        int min2=num[1];

        if(num[0]>num[1]){
            //if first element is greater than second element
            max=num[0];
            max2=num[1];
        }
        else{
            //if second element is greater than first
            max=num[1];
            max2=num[0];
        }

        for(int i=0;i<num.length;i++){
            if(num[i]>max){
                max2=max;
                max=num[i];
            }
            else if(num[i]<max && num[i]>max2){
                max2=num[i];
            }
            if(num[i]<min){
                min2=min;
                min=num[i];
            }
            else if(num[i]>min && num[i]<max2){
                min2=num[i];
            }
        }
        System.out.println("maximum among array is: "+max);
        System.out.println("minimum among array is: "+min);
        System.out.println("second largest among array is: "+max2);
        System.out.println("second smallest among array is: "+min2);
    }

    public static void main(String[] args) {

        int[] number={5,7,3,4,5,6,9,8,7,1,2};

        maxArray(number);
    }
}
