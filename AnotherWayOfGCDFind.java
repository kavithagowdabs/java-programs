package palin;

import java.util.Scanner;

public class AnotherWayOfGCDFind 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int n1,n2;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 1st num");
		n1=sc.nextInt();
		System.out.println("enter 2nd num");
		n2=sc.nextInt();
		while(n1!=n2)
		{
			if(n1>n2)
			{
				n1=n1-n2;
			}
			else
			{
				n2=n2-n1;
			}
		}
		//System.out.println(n1);
		System.out.println("The gcd is..." +n2);
	}

}
