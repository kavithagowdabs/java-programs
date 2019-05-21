import java.util.Scanner;

public class SumOfElemForInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		int res=0;
		int temp;
		int rem=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter num");
		n=sc.nextInt();
		temp=n;
		while (n > 0)
		{
		    rem = n % 10;
		    res = res + rem;
		    n = n/10;
		}
		System.out.println("sum of digits is..." +res);
	}

}
