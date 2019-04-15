package palin;

import java.util.Scanner;

public class StrPalindromeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String orig,rev="";
		Scanner sc=new Scanner(System.in);
		System.out.println("enter str");
		orig=sc.next();
		//length=orig.length();
		for(int i=orig.length()-1;i>=0;i--)
		{
			rev=rev+orig.charAt(i);
			
		}
		if(orig.equals(rev))
		{
		
			System.out.println("pali");
		}
			
		else
		{
			System.out.println("not");
		}

	}

}
