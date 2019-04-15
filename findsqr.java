package sqare;

import java.util.Scanner;

class power
{
	void m()
	{
		Scanner sc=new Scanner(System.in);
		int n,b,k,result = 1;
		System.out.println("enter value of n");
		n=sc.nextInt();
		System.out.println("enter value of b");
		b=sc.nextInt();
		//System.out.println("enter value of k");
		//k=sc.nextInt();
		for(int i=0;i<b;i++)
		{
			result=result*n;
			
		}
		System.out.println(result+" is the result");
		
	}
}
public class findsqr
{
	public static void main(String[] args) 
	{
		 power p=new  power();
		 p.m();
		

	}

}
