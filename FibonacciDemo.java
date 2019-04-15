package fibo;

import java.util.Scanner;

class Fibonacci
{
	void m()
	{
		Scanner sc=new Scanner(System.in);
		int n1=0,n2=0,n3=1,n,i;
		//System.out.println(n1+" "+n2);
		System.out.println("enter value of n");
		n=sc.nextInt();
		for(i=1;i<=n;i++)
		{
			n1=n2;
			n2=n3;
			n3=n1+n2;
			System.out.println(+n1);
		}
		
	}
}
public class FibonacciDemo {

	public static void main(String[] args)
	{
		Fibonacci f=new Fibonacci();
		f.m();

	}

}
