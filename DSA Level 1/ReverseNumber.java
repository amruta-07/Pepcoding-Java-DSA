package Pepcode;

import java.util.Scanner;

public class ReverseNumber {
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number: ");
		int n = sc.nextInt();
		 //reverse a  given number
		while(n>0) {
			int dig=n%10;
			n=n/10;

			System.out.print(dig);
		}
	}
}
