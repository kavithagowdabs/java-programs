import java.util.Scanner;

public class Anagram 
{
	public static void main(String[] args)
	
	{
		String s1,s2;
		int len1,len2,found=0,notfound=0;
		int len;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter str1 and str2");
		s1=sc.nextLine();
		s2=sc.nextLine();
		len1=s1.length();
		len2=s2.length();
		if(len1==len2)
		{
			len=len1;
			for(int i=0;i<len;i++)
			{
				found=0;
				for(int j=0;j<len;j++)
				{
					if(s1.charAt(i)==s2.charAt(j))
					{
						found=1;
						break;
					}
				}
				
				if(found==0)
				{
					notfound=1;
					break;
				}
				
				if(notfound==1)
				{
					System.out.println("are not anagram ");
				}
				else
				{
					System.out.println("yes");
				}
			}
			
			
		}
		else
		{
			System.out.println("both strs must have the same no. of chars to be an anagram");
		}

	}

}
