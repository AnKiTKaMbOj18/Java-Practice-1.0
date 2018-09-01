package JavaInterview;


public class LargestNumber {

    public static int largest(int number,int digit){

        char ch=Integer.toString(digit).charAt(0);

        for(int i=number;i>0;--i){

            if(Integer.toString(i).indexOf(ch)==-1){

                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        System.out.println(largest(123,2));
        System.out.println(largest(134,3));
        System.out.println(largest(143,4));
        System.out.println(largest(153,5));
    }
}
