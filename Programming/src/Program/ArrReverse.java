package Program;

import java.util.Scanner;

public class ArrReverse {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		    System.out.println("enter the size of array:");
			int n = sc.nextInt();
			int ar[]=new int[n];
			System.out.println("enter "+n+"values");
			 for(int i=0;i<n;i++)
			 {
			  ar[i]=sc.nextInt();
			  }
			int r=reverseOfArray(ar);
			System.out.println("reverse of array is "+r);
				}
	static int reverseOfArray(int x[]) {
	int	reverse=0;
		for(int i=0;i<x.length;i++) {
			while(x[i]>0) {
			int	a=x[i]%10;
				reverse=reverse*10+a;
				x[i]=x[i]/10;
				}
		}
		return reverse;
	}

}
