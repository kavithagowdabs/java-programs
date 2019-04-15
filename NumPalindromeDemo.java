package palin;

import java.util.Scanner;

class palindrome
{
	int n;
	int rem,rev=0,temp;
	Scanner sc=new Scanner(System.in);
	void m()
	{
		System.out.println("enter the number");
		n=sc.nextInt();
		temp=n;
		while(temp!=0)
		{
			rem=temp%10;
			rev=rev*10+rem;
			temp=temp/10;
		}
		//System.out.println(rev);
		if(n==rev)
		{
			System.out.println(n+" is a pali");
		}
		else
		{
			System.out.println(n+ " is not a pali");
		}
		
	}
}

public class NumPalindromeDemo {

	public static void main(String[] args) 
	{
		palindrome p=new palindrome();
		p.m();
	}

}
