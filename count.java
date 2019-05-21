package countconsonants;

import java.util.Scanner;

class vowels1
{
	String str;
	int vowels=0,consonants=0,digit=0;
	Scanner sc=new Scanner(System.in);
	void m()
	{
		System.out.println("enter the sentence");
		str=sc.next();
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u'|| ch=='A'|| ch=='E'|| ch=='I'||ch=='O'||ch=='U')
			{	
		    vowels++;
			}
			
			else if(ch>='a' && ch<='z' || ch>='A' && ch<='Z')
			{
				consonants++;
			}
			
			else if(ch>='0' && ch<='9')
			{
				digit++;
			}
		}
		System.out.println("the no. of vowels are "+vowels);
		System.out.println("the no. of consonants are "+consonants);
		System.out.println("the no. of digits are "+digit);
		
	}
}

public class count {

	public static void main(String[] args)
	{
		 vowels1 v=new  vowels1();
		 v.m();

	}
}

