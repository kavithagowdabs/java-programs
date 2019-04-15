package abc;

import java.util.Scanner;

public class SwapThreeNums {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=20;
		int c=30;
		Scanner sc=new Scanner(System.in);
		System.out.println("before swapping "+a+" "+b+" "+c);
		a=a+b+c;
		b=a-(b+c);
		c=a-(b+c);
		a=a-(b+c);
		System.out.println("after swapping "+a+" "+b+" "+c);
	}

}
