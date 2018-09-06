package Data_Structure;


//Selection Sort: Selection sort is a simple sorting algorithm.
// This sorting algorithm is an in-place comparison-based algorithm in which the list is divided into two parts,
// the sorted part at the left end and the unsorted part at the right end.
// Initially, the sorted part is empty and the unsorted part is the entire list.
//
//The smallest element is selected from the unsorted array and swapped with the leftmost element,
//and that element becomes a part of the sorted array. This process continues moving unsorted
// array boundary by one element to the right.
//
//This algorithm is not suitable for large data sets as its average and worst case complexities
// are of Ο(n2), where n is the number of items.

public class SelectionSort {

    public static void selectionSort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {

            int index = i;

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[j] < arr[index]) {
                    index = j; //searching for lowest index
                }

            }
            int smallerNumber = arr[index];
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }
    }

    public static void main(String[] args) {

        int[] arr = {2, 33, 432, 24, 45, 333, 12, 543, 1, 6, 3};
        System.out.println("Array before selection sort: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();

        selectionSort(arr); //selection sort i.e sorting arr using selection sort algorithm

        System.out.println("Array after selection sort: ");

        for (int i : arr) {
            System.out.print(i + " ");
        }

    }
}
