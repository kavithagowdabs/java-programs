import java.util.Scanner;

public class MissingElemArrayDemo {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int a[]={1,2,4,5,6};
		//System.out.println(a);
		int miss=getMissingElem(a,5);
		System.out.println(miss);
	}
	static int getMissingElem(int a[],int n)
	{
		int tot,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter value of n");
		n=sc.nextInt();
		tot=(n+1)*(n+2)/2;
		for(i=0;i<n;i++)
		tot-=a[i];
		return tot;
	}

}
