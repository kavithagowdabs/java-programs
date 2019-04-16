import java.util.Scanner;

public class PrimeOrNotDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter element");
		n=sc.nextInt();
		boolean flag=true;
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)//condition for non prime number
			{
				flag=false;
				break;	
			}
		}
		if(flag)
		{
			System.out.println("prime");
		}
		else
		{
			System.out.println("not");
		}

	}

}
