
import java.util.Arrays;

// Given an array of N integers, and an integer K, find the number of pairs of elements in the array whose sum is equal to K.
// import java.util.HashMap;
import java.util.HashMap;
import java.util.HashSet;

public class Pairs_of_Sum {
    public int[] return_duplicates(int[] arr) {
        // int duplicate[]=new int[];
        HashSet<Integer> duplicte_elements = new HashSet<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                duplicte_elements.add(arr[i]);

            } else {
                map.put(arr[i], 1);
            }
        }
        int ans[] = new int[duplicte_elements.size()];
        int i = 0;
        for (int n : duplicte_elements) {
            ans[i] = n;
            i++;
        }
        return ans;

    }

    public int[] sum(int[] arr, int target) {
        int index[] = new int[2];
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    index[i] = 0;
                    index[j] = 1;
                    return index;
                }
            }
        }
        return index;

    }

    public static void main(String[] args) {
        Pairs_of_Sum obj = new Pairs_of_Sum();
        int result[] = { 1, 3, 2, 1, 2 };

        int b[] = obj.return_duplicates(result);
        System.out.println(Arrays.toString(b));

        int a[] = { 1, 5, 7, 1 };

        int target = 6;
        int ans[] = obj.sum(a, target);
        System.out.println(Arrays.toString(ans));
        // for (int i = 0; i < ans.length; i++) {
        // System.out.println(ans[i]);

        // }
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] + a[j] == target) {
                    count++;
                    break;
                }
            }
        }
        System.out.println(count);

    }

}
