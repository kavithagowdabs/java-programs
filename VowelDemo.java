package even;
import java.util.Scanner;
class VowelChecking
{
	void m()
	{
		Scanner sc=new Scanner(System.in);//for read...
		String ch;
		System.out.println("Enter a alphabet");//vowel or not
		ch=sc.next();
		switch(ch)
		{
		case "a":
		case "e":
		case "i":
		case "o":
		case "u":
		
			System.out.println("vowel");
		break;
		default:
			System.out.println("not a vowel");
		
		}
		
		//System.out.println("Enter the value of i");//vowel or not
		//i=sc.nextInt();		
	}
}
public class VowelDemo{

	public static void main(String[] args)
	{
		VowelChecking obj=new VowelChecking();
		obj.m();
	
	}

}
