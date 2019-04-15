package palin;

import java.util.Scanner;

public class ReverseNumDemo {

	public static void main(String[] args)
	{
		int n;
		int rem,rev=0,temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		n=sc.nextInt();
		temp=n;
		while(temp!=0)
		{
			rem=temp%10;
			rev=rev*10+rem;
			temp=temp/10;
		}
		System.out.println("the reverse num is...."+rev);
	}

}
