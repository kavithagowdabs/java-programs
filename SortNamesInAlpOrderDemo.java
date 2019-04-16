import java.util.Scanner;

public class SortNamesInAlpOrderDemo {

	public static void main(String[] args)
	{
		int n;
		String temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no. of names");
		n=sc.nextInt();
		String names[]=new String[n];
		System.out.println("enter the names");
		for(int i=0;i<n;i++)
		{
			names[i]=sc.nextLine();
		}
		//sorting names
		for(int i=0;i<n;i++)
		{
			for(int j=i;j<n;j++)
			{
				if(names[i].compareTo(names[j])>0)
				{
					temp=names[i];
					names[i]=names[j];
					names[j]=temp;
					
				}
			}
		}
		//order
		System.out.println("names in sorted order");
		for(int i=0;i<n;i++)
		{
			System.out.println(names[i]);
		}
		//System.out.println(names[n-1]);

	}

}
