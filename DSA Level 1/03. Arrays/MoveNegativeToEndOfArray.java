import java.util.*;

public class MoveNegativeToEndOfArray {
    public static void main(String[] args) {
        int arr[] = { -1, 3, 4, -5, 6, -7, 1, -9 };
        int n = 8;
        int start = 0;
        int end = n - 1;
        while (start <= end) {
            while (arr[start] > 0) {
                start++;

            }
            if (start == end) {
                break;
            }

            while (arr[end] < 0) {
                end--;
            }
            if (arr[start] < 0 && arr[end] > 0) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
            }

        }
        System.out.println(arr[start] + " " + arr[end]);
        System.out.println(Arrays.toString(arr));
    }

}
