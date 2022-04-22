package Pepcode;

import java.util.Scanner;

public class RotateNumber {
	public static void main(String []args) {
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		int k=sc.nextInt();
		
		int temp = n;
		int  nod=0;
		while(temp>0) {
			temp=temp/10;
			nod++;
			
		}
		int div=1;
		int mul=1;
		for(int i=1; i<=nod; i++) {
			if(i<=k) {
				div=div*10;
			}
			else {
				mul=mul*10;
			}
		}
		int q= n/div;
		int r= n%div;
		int s=r*mul+q;
		System.out.print(s);
		
		
		
	}

}

// Input: n=123456
//       k=2                
// Output: 561234 