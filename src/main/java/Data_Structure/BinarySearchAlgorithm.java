package Data_Structure;

//Binary search is a fast search algorithm with run-time complexity of Ο(log n).
// This search algorithm works on the principle of divide and conquer.
// For this algorithm to work properly, the data collection should be in the sorted form.

// Binary search looks for a particular item by comparing the middle most item of the collection.
// If a match occurs, then the index of item is returned. If the middle item is greater than the item,
// then the item is searched in the sub-array to the left of the middle item. Otherwise,
// the item is searched for in the sub-array to the right of the middle item.
// This process continues on the sub-array as well until the size of the subarray reduces to zero.

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchAlgorithm {

    public static void main(String[] args) {

        int number, counter, first, last, mid, sitem, array[];
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of elements for array");
        number = sc.nextInt();

        array = new int[number];

        System.out.println("Enter " + number + " array elements: ");
        for (counter = 0; counter < number; counter++) {
            array[counter] = sc.nextInt();
        }
        System.out.println("Length of array is : " + array.length);
        System.out.println("Enter the element to search in the list of array elements: ");

        sitem = sc.nextInt();
        Arrays.sort(array); //binary search works on sorted arrays only so sort first

        first = 0;
        last = number - 1;
        mid = (first + last) / 2;

        for (counter = 0; counter < number; counter++) {
            if (array[mid] < sitem) {
                first = mid + 1;
            } else if (array[mid] > sitem) {
                last = mid - 1;
            } else {
                printArray(array);
                System.out.println(sitem + " is found in the list of array at location: " + (mid + 1));
                break;
            }
            mid = (first + last) / 2;
        }

        //if(first>last){
        //or above one or below one both are correct
        if (counter==number) {
            printArray(array);
            System.out.println(sitem + " is not in the list of array");
        }
    }

    public static void printArray(int[] a) {
        System.out.println("Array of Elements: ");
        System.out.print("{");
        for (int i : a) {
            System.out.print(i + " , ");
        }
        System.out.println("}");
    }

}
