/**
 * Kth_largest_element
 */
public class Kth_largest_element {

    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 12, 64, 67, 21 };
        int k = 5;
        // first of all by using bubble sort i will sort the array time complexity-
        // o(n*n)
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                }
            }

            if (i == k - 1) {
                System.out.println(arr[i]);
            }
        }

    }
}