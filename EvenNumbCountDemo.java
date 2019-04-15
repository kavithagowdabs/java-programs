package evencount;

import java.util.Scanner;

class Count
{
	Scanner sc=new Scanner(System.in);
	int n,i,size,evencount;
	void m()
	{
		System.out.println("enter the no. of array elements");
		n=sc.nextInt();
		System.out.println("enter the elements of the array");
		for(int i=0;i<n;i++)
		{
		size=sc.nextInt();
		}
		for(int i=0;i<size;i++)
		{
			if(i%2==0)
			{
				//System.out.println(i);
				evencount++;
			}
		}
		System.out.println("\n Total Number of Even Numbers in this Array = " + evencount);
		
		
		
	}
}

public class EvenNumbCountDemo
{

	public static void main(String[] args)
	{
		Count ob=new Count();
		ob.m();


	}

}
