package Program;

import java.util.Scanner;

public class ProductOfArrayNumbers {

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
			 int r=productOfArray(ar);
			 System.out.println("product of array is: "+r);
	}
			 static int productOfArray(int x[]) {
				 int product=1;
				 for(int i=0;i<x.length;i++) {
					 product=product*x[i];
				 }
				 return product;
			 }
	}


