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
        System.out.println(Arrays.toString(BubbleSortHelper(arr, swapped)));
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
