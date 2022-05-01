package Pepcode;

import java.util.Scanner;

public class AnyBaseToAnyBase {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int n = sc. nextInt();
		int b1 = sc. nextInt();
		int b2 = sc. nextInt();
		int d = getValue(n, b1, b2);
		System.out.println(d);
	}
	public static int getValue(int n, int b1, int b2) {
		int dec = anybasetodecimal(n, b1);
		int dn = decimaltoanybase(dec, b2);
		return dn;
		 
		
	}
	public static int decimaltoanybase(int n, int b) {
		int rv=0;
		int p = 1;
		while(n>0) {
			int dig= n % b;
			n = n / b;
			rv += dig * p;
			p = p * 10;
			
			
		}
		return rv;
	}
	
	public static int anybasetodecimal(int n, int b) {
		int rv=0; 
		
		int p=1;
		 while(n>0) {
			 int dig = n %10;
			 n = n / 10;
			 rv += dig * p;
			 p = p * b;
		 }
		 return rv;
		
	}

}

// input- 172
// 8
// 2
// output- 1111010

