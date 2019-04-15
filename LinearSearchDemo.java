import java.util.Scanner;

public class LinearSearchDemo {

	public static void main(String[] args) 
	{
		int n;
		int i;
		int search;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no. of elements");
		n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("the array elements are..");
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		//System.out.println(a[i]);
		System.out.println("enter search value");
		search=sc.nextInt();
		for(i=0;i<n;i++)
		{
			if(a[i]==search)
			{
				System.out.println("found...." + search + " is present at the loc " + (i+1) + " ");
				break;
			}
		}
		if(i==n)
		{
			System.out.println("search val not found");
		}
	}

}
