package Program;

import java.util.Scanner;

public class ArrEvenOdd {

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
		 int ct[]=countEO(ar);
		System.out.println("number of even values "+ct[0]);
		 System.out.println("number of odd values "+ct[1]);
	}
	static int[] countEO(int x[]) {
		int ec=0,oc=0;
		for(int i=0;i<x.length;i++) {
			if(x[i]%2==0)
				ec++;
			else
				oc++;
		}
		int count[]= {ec,oc};
	    return count; 
}
}