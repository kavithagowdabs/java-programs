package additionofarrays;

import java.util.Scanner;

class loop
{
	int n,i,j,m;
	void m()
	{
		int a[][]=new int[10][10];
		int b[][]=new int[10][10];
		int c[][]=new int[10][10];
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no. of rows n column values");
		n=sc.nextInt();
		m=sc.nextInt();
		
		
		System.out.println("enter the array elements of first");
		for(int i=0;i<n;i++)
			for(int j=0;j<m;j++)
				a[i][j]=sc.nextInt();
			
		
		System.out.println("enter the array elements of SECOND");
		for(int i=0;i<n;i++)
			for(int j=0;j<m;j++)
				b[i][j]=sc.nextInt();
			
		
		
		
		//System.out.println("addition\n");
	    //c[i][j]=sc.nextInt();
		for(int i=0;i<n;i++)
			for(int j=0;j<m;j++)
				c[i][j]=a[i][j]*b[i][j];
		//System.out.print("result is...." +c[i][j]);
		
		
		System.out.println(" the new matrix is...\n");
		for(int i=0;i<n;i++)
			for(int j=0;j<m;j++)
				System.out.print(+c[i][j]);
					System.out.println("");
	}
}



public class array1 
{

	public static void main(String[] args) 
	{
		loop ob=new loop();
		ob.m();


	}

}
