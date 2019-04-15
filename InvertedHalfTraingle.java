package nestedfor;

import java.util.Scanner;

class GenerateStar3   //custom classes
{
	int i,n;
	Scanner sc=new Scanner(System.in);
	void m()
	{
		System.out.println("enter the range");
		n=sc.nextInt();
		for(int i=n;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
	}

}
public class InvertedHalfTraingle {

	public static void main(String[] args)
	
	{
		// TODO Auto-generated method stub
		GenerateStar3 ob=new GenerateStar3();
		ob.m();

	}

}
