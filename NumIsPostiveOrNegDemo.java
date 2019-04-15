package abc;

import java.util.Scanner;

public class NumIsPostiveOrNegDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter num");
		n=sc.nextInt();
		if(n>0)
		{
			System.out.println(n + " is a pos num");
		}
		else if(n<0)
		{
			System.out.println(n + " is a neg num");
		}
		else
		{
			System.out.println(n + "both are same");
		}

	}

}
