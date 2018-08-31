package JavaInterview;

import java.util.Scanner;

public class Rough {

    public static void showPyramid(int n){

        int i,j;

        for(i=0;i<n;i++){

            for(j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=5;
        showPyramid(n);
    }
}
