import java.util.Scanner;

public class SmallestElemDemo {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int n,min;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter num");
		n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("enter elemts..");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(a[i]>a[j])
				{
					min=a[i];
					a[i]=a[j];
					a[j]=min;
				}
			}
		}
		System.out.println(a[0]);//oth pos
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(a[i]>a[j])
				{
					int max=a[i];
					a[i]=a[j];
					a[j]=max;
				}
			}
		}
		System.out.println(a[n-1]);//1st smallest elem
		//System.out.println(a[n-2]);//2nd smallest elem
		
		
	}

}
