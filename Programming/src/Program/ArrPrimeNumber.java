package Program;
import java.util.Scanner;
public class ArrPrimeNumber {
 static boolean isPrime(int x) {
	for(int i=2;i<=x/2;i++)
	{
		if(x%i==0)
			return false;
		}
		
			return true;
}
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
	}
			 static int countPrimeNumbers(int x[]) {
				 int count=0;
				 for(int i=0;i<x.length;i++) {
					 boolean rs=isPrime(i);
				 if(rs==true)
					 count++;
			 }
				 return count;
	}

}
			