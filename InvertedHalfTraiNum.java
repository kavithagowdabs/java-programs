package nestedfor;

import java.util.Scanner;

class GenerateStar5   //custom classes
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
				System.out.print(j+"");
			}
			System.out.println("");
		}
	}

}
public class InvertedHalfTraiNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenerateStar5 ob=new GenerateStar5();
		ob.m();

	}

}
