package nestedfor;

import java.util.Scanner;

class GenerateNum4  //custom classes
{
	int i,n;
	Scanner sc=new Scanner(System.in);
	void m()
	{
		System.out.println("enter the range");
		n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+"");
			}
			System.out.println("");
		}
	}

}

public class HalfTraiNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenerateNum4 ob=new GenerateNum4();
		ob.m();
	}

}
