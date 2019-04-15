package nestedfor;

import java.util.Scanner;

class GenerateFloyd   //custom classes
{
	int i,n;
	int num=1;
	Scanner sc=new Scanner(System.in);
	void m()
	{
		System.out.println("enter the range");
		n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(num+" ");
				num++;
			}
			System.out.println();
		}
	}

}
public class FloydTraingle
{

	public static void main(String[] args) 
	{
		GenerateFloyd ob=new GenerateFloyd();
		ob.m();

	}

}
