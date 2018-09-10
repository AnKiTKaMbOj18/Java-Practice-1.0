package Data_Structure;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {

    public static void insertionSort(int[] arr){

        for(int i=0;i<arr.length;i++){
            int key=arr[i];
            int j=i-1;

            while(j>=0 && (arr[j]>key)){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int[] arr=new int[6];

        System.out.println("Enter all "+arr.length+" array elements");
        for(int i=0;i<6;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("List of array elements before sorting: ");
        Arrays.stream(arr).forEach(data-> System.out.print(data+" "));

        insertionSort(arr); //sorting of elements of array using insertion sort

        System.out.println();

        System.out.println("List of array elements after sorting: ");

        Arrays.stream(arr).forEach(data-> System.out.print(data+" "));
    }
}
