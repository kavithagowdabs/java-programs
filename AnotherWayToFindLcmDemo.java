package palin;

import java.util.Scanner;

public class AnotherWayToFindLcmDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1,n2;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 1st num");
		n1=sc.nextInt();
		System.out.println("enter 2nd num");
		n2=sc.nextInt();
		int lcm=n1>n2 ? n1 : n2;
		while(true)
		{
			if(lcm%n1==0 && lcm%n2==0)
			{
				System.out.println(lcm + " is the lcm");
				break;
			}
			lcm++;
		}

	}

}
