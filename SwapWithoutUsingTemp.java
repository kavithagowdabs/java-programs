package abc;

import java.util.Scanner;

public class SwapWithoutUsingTemp {

	public static void main(String[] args) 
	{
	int x,y;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter 1st elem");
	x=sc.nextInt();
	System.out.println("enter 2nd elem");
	y=sc.nextInt();
	System.out.println("before swapping "+x+" "+y);
	x=x+y;
	y=x-y;
	x=x-y;
	System.out.println("after swapping "+x+" "+y);
	}

}
