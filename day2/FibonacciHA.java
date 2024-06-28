package week1.day2;

public class FibonacciHA {

	public static void main(String[] args) {
		//Values to be printed upto 8 times 
		int n =8;
		//Initial values are given in n1 and n2 for fibonacci
		int n1 =0;
		int n2=1;
		System.out.println("The fibonacci series till "+n+" terms:");
		
		for(int i=0;i<n;i++)
		{
			System.out.print(n1+",");
			
			int n3=n1+n2;
			n1=n2;
			n2=n3;
		}

	}

}
