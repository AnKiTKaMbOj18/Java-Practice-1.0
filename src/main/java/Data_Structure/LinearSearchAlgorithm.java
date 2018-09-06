package Data_Structure;


//Linear search is a very simple search algorithm. In this type of search,
// a sequential search is made over all items one by one. Every item is checked and if a match is found
// then that particular item is returned, otherwise the search continues till the end of the data collection.

import java.util.Scanner;

public class LinearSearchAlgorithm {

    public static void main(String[] args) {
        int number, sitem, counter, array[];

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in array");
        number = sc.nextInt();
        array = new int[number];

        System.out.println("Enter "+ number + " array elements");
        for(counter=0;counter<number;counter++){
            array[counter]=sc.nextInt();
        }
        System.out.println("length of array is: "+array.length);
        System.out.println("Enter element to searched in array");

        sitem=sc.nextInt();
        for(counter=0;counter<number;counter++){
            if(array[counter]==sitem){
                System.out.println("Search Element "+sitem+" is found in array at location "+(counter+1));
                break;
            }
        }

        if(counter==number){
            System.out.println("Search Element "+sitem+ "is not in the list");
        }
    }

}
