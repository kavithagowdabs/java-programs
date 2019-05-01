import java.util.Scanner;

public class PrintAlternativeElemInArray {

	public static void main(String[] args) {
		int i,n;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter num");
		n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("enter no. of elements");
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("the array elemts are..");
		for(i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}
		
		
		System.out.println("the alternative array elemts are..");
		for(i=0;i<n;i+=2)
		{
			System.out.println(a[i]);
		}
		
	}
	

}
