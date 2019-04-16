import java.util.Scanner;

public class SumOfFactorialsDemo {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int n;
		int tot=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter val of n");
		n=sc.nextInt();
		int i=1;
		while(i<=n)
		{
			int fact=1;
			int j=1;
			while(j<=i)
			{
				fact=fact*j;
				j=j+1;
			}
			tot=tot+fact;
			i=i+1;
		}
		System.out.println(tot);
		//1!+2!+3!=1+2+6=9
	}

}
