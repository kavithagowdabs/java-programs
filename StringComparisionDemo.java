import java.util.Scanner;

public class StringComparisionDemo {

	public static void main(String[] args) 
	{
		String s1,s2;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter str1");
		s1=sc.nextLine();
		System.out.println("enter str2");
		s2=sc.nextLine();
		if(s1.compareTo(s2)>0)
		{
			System.out.println("s1 is greater");
		}
		else if(s1.compareTo(s2)<0)
		{
			System.out.println("s2 is greater");
		}
		else
		{
			System.out.println("both are equal");
		}
	}

}
