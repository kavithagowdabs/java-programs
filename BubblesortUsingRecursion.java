import java.util.*;
class BubbleSort
{
	void sort( int a[],int n)
	{ 
		if(n==1)
			return;
		for(int i=0;i<n-1;i++)
			if(a[i]>a[i+1])
			{
				int tmp=a[i];
				a[i]=a[i+1];
				a[i+1]=tmp;
			}
		sort(a,n-1);
	}
}
public class BubblesortUsingRecursion
{

	public static void main(String[] args) 
	{
		int a[]={7,5,9,2,4,1};
		
		BubbleSort b=new BubbleSort();
		b.sort(a,a.length);
		System.out.println("sorted array is..");
		System.out.println(Arrays.toString(a));
	}

}
