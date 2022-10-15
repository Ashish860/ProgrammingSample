package Program;
import java.util.Scanner;
class MainAr1
{ 
 public static void main(String[]args)
 {
  Scanner sc=new Scanner(System.in);
    System.out.println("enter the size of array:");
	int n = sc.nextInt();
	int ar[]=new int[n];
	System.out.println("enter "+n+"values");
	 for(int i=0;i<n;i++)
	 {
	  ar[i]=sc.nextInt();
	  }
	  int biggest=getBiggest(ar);
 }
	   static int getBiggest(int ar[])
	   {
	    int big=ar[0];
		for(int i=1;i<ar.length;i++)
		{
		   if(ar[i]>big)
		     {
			  big=ar[i];
			 }
		}
		System.out.println(big);
	   return big;
	   } 
} 