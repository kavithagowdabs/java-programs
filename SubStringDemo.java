import java.util.Scanner;

public class SubStringDemo {

	public static void main(String[] args)
	{
		String str,sub;
		int i,j;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter str");
		str=sc.nextLine();
		System.out.println("substrings of string are..");
		for(i=0;i<=str.length();i++)
		{
			for(j=0;j<=str.length()-i;j++)
			{
				sub=str.substring(i,i+j);
				System.out.println(sub);
				
			}
			
		}

	}

}
