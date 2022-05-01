package Pepcode;

import java.util.Scanner;

public class DigitFrequency {
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int d=sc.nextInt();
		int f= getDigitFrequency(n, d);
		System.out.println(f);
	}
	public static int getDigitFrequency(int n, int d) {
		int rv=0;
		while(n>0) {
			int dig=n%10;
			n=n/10;
			if(dig==d) {
				rv++;
			}
		}
		return rv;
		
	}

}

//input n= 123435383
// d= 3
// output= 4   
//because digit 3 repeated at 4 times 
