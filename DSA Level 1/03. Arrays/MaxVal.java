public class MaxVal {
    public static void main(String args[]) {
        int[] arr = { 59, 45, 6, 7, 53, 21 };
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }

        }
        System.out.println(min);

       
    }
   

}

