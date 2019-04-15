package exception;

import java.util.Scanner;

class loginexception extends RuntimeException {
	
}

public class exceptionhandling 
{
	public static void main(String[] args) throws Exception
	{
		Scanner sc=new Scanner(System.in);
		String name, pwd;
		System.out.println("enter the user name..");
		name=sc.next();
		System.out.println("enter the password..");
		pwd=sc.next();
		if(name.equals("abc") && pwd.equals("123"))
		{
			System.out.println("welcome..");
		}
		else
		{
			try
			{
				throw new loginexception();
			}
			catch(loginexception e)
			{
				System.out.println("entered inputs are incorrect,so please enter the new values");
			}
			finally
			{
				//System.out.println("running successfully");
			}
			
		}
		
	}

}
