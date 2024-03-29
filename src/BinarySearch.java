public class BinarySearch {
    // class to implement binary search algorithm
    // Assumption, the array is sorted.

    public int binarySearch(int[] arr, int target) {
        int start = 0, end = arr.length - 1, mid = start + (end - start) / 2;
        while (start <= end) {
            mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {

                end = mid - 1;


            } else {
                start = mid + 1;

            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 7, 8, 10, 12, 45, 90};
        int target = 12;
        BinarySearch bin = new BinarySearch();

        System.out.println("target: " + bin.binarySearch(arr, target));
    }
}
