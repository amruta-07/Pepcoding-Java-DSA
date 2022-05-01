package Pepcode;

import java.util.Scanner;

public class FindElementInArray {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int []arr = new int[n];
		for(int i = 0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
			
		}
		int data = sc.nextInt();
		int idx = -1;
		
		for(int i= 0; i<arr.length; i++) {
			if(arr[i] == data) {
				idx = i;
				break;
			}
		}
		System.out.println(idx);
		
		
		
	}

}
//input: 3
//       1
//       2
//       3
//       2   if 2 is in given array element then print index else -1 so the output is 1.
