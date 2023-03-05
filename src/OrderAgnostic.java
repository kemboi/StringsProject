public class OrderAgnostic {
    // Performing binary search on an array based on order agnostic method

    public int orderAgnostic(int[] arr, int target) {

        int start = 0, end = arr.length - 1, mid = start + (end - start) / 2;
        boolean asc = (arr[start] < arr[end]);
        while (start <= end) {
            mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return 1;
            }
            if (asc) {
                if (arr[mid] > target) {

                    end = mid - 1;

                } else {
                    start = mid + 1;
                }
            } else {
                if (arr[mid] < target) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }

            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 7, 8, 10, 12, 45, 90};
        int[] arrDesc = {90, 80, 70, 45, 30, 10, 5, 2, 1};
        int target = 5;
        OrderAgnostic bin = new OrderAgnostic();

        System.out.println("target: " + bin.orderAgnostic(arrDesc, target));
    }
}
