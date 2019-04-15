package palin;

import java.util.Scanner;

public class LcmOfTwoNumDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1,n2;
		int gcd=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 1st num");
		n1=sc.nextInt();
		System.out.println("enter 2nd num");
		n2=sc.nextInt();
		for(int i=1;i<=n1 && i<=n2;i++)
		{
			if(n1%i==0 && n2%i==0)
			{
				gcd=i;
			}
		}
		int lcm=(n1*n2)/gcd;
		System.out.println(lcm + " is the lcm of two numbers");

	}

}
