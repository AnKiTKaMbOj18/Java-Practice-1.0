package Data_Structure;

//In bubble sort algorithm, array is traversed from first element to last element. Here,
// current element is compared with the next element.
// If current element is greater than the next element, it is swapped.

public class BubbleSortAlgorithm {

    public static void bubbleSort(int[] arr) {

        int n = arr.length;
        int temp = 0;

        for (int i = 0; i < n; i++) {

            for (int j = 1; j < n - i; j++) {

                if (arr[j - 1] > arr[j]) {

                    //swap elements

                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }

    }

    public static void main(String[] args) {

        int[] arr = {3, 60, 35, 2, 45, 320, 5};

        System.out.println("Array before bubble sort: ");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        bubbleSort(arr);  //sorting array elements using bubble sort algorithm

        System.out.println("Array after bubble sort: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
