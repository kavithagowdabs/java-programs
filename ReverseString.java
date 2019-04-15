package palin;

import java.util.Scanner;

class str
{
	void m()
	{
		String orig,rev="";
		Scanner sc=new Scanner(System.in);
		System.out.println("enter str");
		orig=sc.next();
		//length=orig.length();
		for(int i=orig.length()-1;i>=0;i--)
		{
			rev=rev+orig.charAt(i);
			
		}
		
		System.out.println("the reverse string is... "+rev);
		
	}
	
}
public class ReverseString {

	public static void main(String[] args)
	{
		str s=new str();
		s.m();

	}

}
