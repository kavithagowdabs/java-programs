package nestedfor;

import java.util.Scanner;

class GenerateStar   //custom classes
{
	int i,sum,n;
	Scanner sc=new Scanner(System.in);
	void m()
	{
		System.out.println("enter the range");
		n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
	}

}

public class RectangleTriangleDemo
{

	public static void main(String[] args) 
	{
		GenerateStar ob=new GenerateStar();
		ob.m();
	}

}
