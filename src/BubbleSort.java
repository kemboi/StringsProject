import java.util.Arrays;
/* A stable sorting algorithm - order remains the same when values are equal.
* keep swapping each element with the adjacent one until the array is sorted
* The largest element will be at the end, after the first pass.
* Time complexity is O(N) is best case - when no swap occurs, then break.
* O(N*N) for worst case array is sorted in descending order
*/
public class BubbleSort {
    public static void main(String [] args){

        int [] arr = new int[]{1, 6, 2, 3, 0, 6, 3, 100, 11};
        boolean swapped = false;
        System.out.println("Bubble Sort Solution : ");
        System.out.println(Arrays.toString(BubbleSortHelper(arr, swapped)));
        // using selection sort
        SelectionSort select = new SelectionSort();
        System.out.println("Selection Sort Solution : ");
        System.out.println(Arrays.toString(select.selectionsort(arr)));
    }
    private static int[] BubbleSortHelper(int[] arr, boolean swapped) {
        for (int i = 0; i < arr.length; i++){
            for (int j = 1; j < arr.length - i; j++)
            {
                if (arr[j] < arr[j - 1]){
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
        return arr;
    }

}
class SelectionSort{
    /*Keep finding the maximum or minimum element in the array and place the element in its correct index
    Selection sort is a simple and efficient sorting algorithm that works by repeatedly selecting
     the smallest (or largest) element from the unsorted portion of the list and moving it to the sorted
     portion of the list. The algorithm repeatedly selects the smallest (or largest) element from the
     unsorted portion of the list and swaps it with the first element of the unsorted portion.
     This process is repeated for the remaining unsorted portion of the list until the entire list is sorted.
     One variation of selection sort is called “Bidirectional selection sort” which goes through the list of elements
      by alternating between the smallest and largest element, this way the algorithm can be faster in some cases.
    *  Defination adopted from GeeksforGeeks (2023) : https://www.geeksforgeeks.org/selection-sort/
    * The running time of this algorithm is same as that of Bubble Sort
    *
    * */
    public int[] selectionsort(int[] arr){
            for (int i = 0; i < arr.length; i++){
                // find the maximum item in the remaining array and swap with the correct index.
                int last = arr.length - i - 1;
                int maxIndex = getMaxIndexEl(arr, 0, last);
                swap(arr, maxIndex, last);
            }
        return arr;
    }
// function to swap between the maximum index element and last index
    private void swap(int[] arr, int maxindex, int last) {

                int temp = arr[maxindex];
                arr[maxindex] = arr[last];
                arr[last] = temp;

        }
// function to return the index with maximum element
    private int getMaxIndexEl(int[] arr, int start, int last) {
        int maxIndex = start;
        for (int i = start; i <= last; i++){
            if (arr[maxIndex] < arr[i])
            {
               maxIndex = i;
            }
        }
        return maxIndex;
    }
}
