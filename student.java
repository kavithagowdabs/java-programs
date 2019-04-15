package studentrecord;
import java.util.Scanner;

class record
{
	int sum,avg,marks,n;
	String name;
	void data()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no. of students");
		n=sc.nextInt();
		//n=sc.nextInt();
		System.out.println("enter the name of the students");
		name=sc.next();
		//name=sc.next();
		System.out.println("enter the marks of the students");
	    marks=sc.nextInt();
		//marks=sc.nextInt();
		if(marks>=90)
			System.out.println("A");
		else if(marks>=80)
			System.out.println("B");
		else if(marks>=70)
			System.out.println("c");
		else if(marks>=60)
			System.out.println("D");
		else
			System.out.println("F");
		
		
	}
}

public class student {

	public static void main(String[] args) 
	{
		record r=new record();  //reference object creation for instance classs
		r.data();               //accessing method

	}

}
