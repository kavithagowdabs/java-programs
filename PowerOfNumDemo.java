package abc;

import java.util.Scanner;

public class PowerOfNumDemo {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int base,expo;
		int res=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 1st num");
		base=sc.nextInt();
		System.out.println("enter 2nd num");
		expo=sc.nextInt();
		while(expo!=0)
		{
			res=res*base;
			expo--;
		}
		System.out.println(res + " is the res");
	}

}
