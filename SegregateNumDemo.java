import java.util.Scanner;

public class SegregateNumDemo
{
	public static void main(String[] args) 
	{
		int i,n;
		Scanner sc=new Scanner(System.in);
		int a[]={0,1,0,1,0,1};
		segregate(a,6);
		for(i=0;i<6;i++)
		{
			System.out.println(a[i]);
		}
	}

	static void segregate(int a[],int size)
	{
		
		int l=0,r=size-1;
		while(l<r)
		{
			while(a[l]==0 && l<r)
			{
				l++;
			}
			while(a[r]==1 && l<r)
			{
				r--;
			}
			if(l<r)
			{
				a[l]=0;
				a[r]=1;
				l++;
				r--;
			}
		}
	}
}