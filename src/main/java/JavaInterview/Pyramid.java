package JavaInterview;

public class Pyramid {

    public static void printStar(int n){

        int i,j;

        //outer loop to handle number of rows
        //n in this case
        for(i=0;i<n;i++){

            //inner loop to handle number of columns
            //values changing acc to outer loop
            for(j=0;j<=i;j++){

                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int n=5;
        printStar(n);
    }
}
