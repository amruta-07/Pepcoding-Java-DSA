package Pepcode;

import java.util.Scanner;

public class InverseOfNumber {
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int inv=0;
		int op=1;  //Original position
		while(n!=0) {
			int od=n%10;  //Original digit
			int ip=od;  
			int id=op;  //inverse digit
			inv=inv+id*(int)Math.pow(10, ip-1);
			n=n/10;
			op++;
		}
		System.out.println(inv);
	}

}


//Input: 14253
//Output:  inverse number is: 24135
