package JavaInterview;

public class NumverBinaryOrNot {

    public static void isBinary(int number){

        boolean binary=true;
        int copyNum=number;

        while(copyNum!=0){
            int temp=copyNum%10;
            if(temp>1){
                binary=false;
                break;
            }
            else{
                copyNum=copyNum/10;
            }
        }
        if(binary){
            System.out.println("number is binary: "+number);
        }
        else{
            System.out.println("number is not binary: "+number);
        }
    }
    public static void main(String[] args) {

        isBinary(1234);
        isBinary(10101);
        isBinary(1201);
        isBinary(101010101);
    }
}
