import java.util.Scanner;

class Bubble
{
	
	int n;
	int i;
	int swap;
	Scanner sc=new Scanner(System.in);
	void BubbleSort()
	{
		
		System.out.println("enter range");
		n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("the array elements are...");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(i=0;i<(n-1);i++)
		{
			for(int j=0;j<n-i-1;j++)
			{
				if(a[j]>a[j+1])
				{
					swap=a[j];
					a[j]=a[j+1];
					a[j+1]=swap;
				}
			}
		}
		
		System.out.println("sorted list of numbers are");
		for(int i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}
		
	}		
}
public class BubbleSortAlg
{

	public static void main(String[] args)
	{
		Bubble b=new Bubble();
		b.BubbleSort();

	}

}
