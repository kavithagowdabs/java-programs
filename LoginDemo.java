import java.util.Scanner;

class LoginCredentials
{
	Scanner sc=new Scanner(System.in);
	String name,pwd;
	void m()
	{
		System.out.println("enter the username");
		name=sc.next();
		System.out.println("enter the pass");
		pwd=sc.next();
		if(name.length()==5 && pwd.length()==3)
		{
			System.out.println("correct credentials");
		}
		else
		{
			if(name=="\0" || name.length()>5 || pwd.length()>3)
			System.out.println("invalid");
		}
		
	}
}

public class LoginDemo {

	public static void main(String[] args)
	{
		LoginCredentials l=new LoginCredentials();
		l.m();

	}

}
