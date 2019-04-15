package studentrecord;
import java.util.Scanner;
class student1
{
	String name;
	int n,avg,sum=0;
	int marks[]=new int[10];
	Scanner sc=new Scanner(System.in);
	student1()
	{
		
		System.out.println("enter the no. of students");
		n=sc.nextInt();
		System.out.println("enter the name of the student");
		for(int i=0;i<n;i++)
		name=sc.next();
		System.out.println("enter the marks of the student");
		for(int i=0;i<=n;i++)
		marks[i]=sc.nextInt();
		for(int i=0;i<=n;i++)
		sum=+marks[i];
		System.out.println("the sum is..");
		avg=sum/n;
		System.out.println("the average is..");
		for( int i=0;i<n;i++)
		if(marks[i]>=90)
			System.out.println("grade A");
		else if(marks[i]>=80)
			System.out.println("grade B");
		else if(marks[i]>=70)
			System.out.println("grade c");
		else if(marks[i]>=60)
			System.out.println("grade D");
		else
			System.out.println("grade F");
		
	}
}

class student2 extends student1
{
	void m()
	{
	System.out.println("The above are the details about student");
	}
}

public class studentdetails 
{
	public static void main(String[] args)
	{
		student2 ob=new student2();
		ob.m();

	}

}
