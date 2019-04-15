package palin;

import java.util.Scanner;

public class GCD {

	public static void main(String[] args) {
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
		System.out.println("the gcd of n1 & n2 is " +gcd);

	}

}
