package array;

import java.util.Scanner;


class loop
{
	int n,i;
	int sum=0;
	void m()
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the range");
		n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("enter the array elements");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("the array elements are...");
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]);
			sum+=arr[i];
		}
		
		System.out.println("the sum is..."+sum);
		
	}
}


public class arrayconcept 
{

	public static void main(String[] args) 
	{
		loop ob=new loop();
		ob.m();

	}

}
