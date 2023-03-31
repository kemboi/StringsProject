import java.util.Arrays;

public class BinarySearch2D {
    public static void main(String [] args){
        int key = 40;
        int[][] matrix = new int[][]{{10, 20, 21, 22},{15, 25, 30, 40}};

        System.out.println("The target element is at position: "+ Arrays.toString(binarySearch2D(matrix, key)));
    }
/*Searching a in a sorted matrix in row and column format*/
    private static int[] binarySearch2D(int[][] matrix, int i) {
        int start = 0; // row
        int end = matrix[0].length - 1; // column
        System.out.println("End = "+end+ " Value at end :"+matrix[start][end]);

        while (start < matrix.length && end >= 0)
        {
            if (i == matrix[start][end]) {
                System.out.println("found"+start+ "   "+end);
                return new int[]{start, end};
            }
            else if (matrix[start][end] < i) {
                   start++;
            }
            else
                  end--;
        }

        return new int[]{-1, -1};
    }
    /* Searching in a strictly sorted array
    case 1: if element == target return
    case 2: element > target
            Then ignore rows after i
    case 3 : ignore the above row
    Case 4: when two rows are remaining

    */

}
