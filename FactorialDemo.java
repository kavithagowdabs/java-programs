package fibo;

import java.util.Scanner;

class factorial
{
	void m()
	{
		Scanner sc=new Scanner(System.in);
		int i,n,fact=1;
		System.out.println("enter value of n");
		n=sc.nextInt();
		for(i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		System.out.println("factorial is "+fact);
	}
}
public class FactorialDemo{

	public static void main(String[] args) 
	{
		 factorial f=new  factorial();
		f.m();


	}

}
