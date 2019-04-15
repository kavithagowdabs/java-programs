import java.util.Scanner;

public class BinarySearchDemo {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int i,num;
		int fir,last,mid,search;
		System.out.println("enter the no. of elements");
		num=sc.nextInt();
		int a[]=new int[num];
		System.out.println("Enter the array element..");
		for(i=0;i<num;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("enter val to search");
		search=sc.nextInt();
		fir=0;
		last=num-1;
		mid=(fir+last)/2;
		while(fir<=last)
		{
			if(a[mid]<search)
			{
				fir=mid+1;
			}
			else if(a[mid]==search)
			{
				System.out.println("found...." + search + " is present at the loc " + (mid+1));
				break;
			}
			else
			{
				last=mid+1;
				mid=(fir+last)/2;
			}
		}
		if(fir>last)
		{
			System.out.println(search + "is not found");
		}
		
	}

}
