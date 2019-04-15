package sumofnumbers;
import java.util.Scanner;

class B
{
	int sum=0,i,n;
	int size;
	Scanner sc=new Scanner(System.in);
	void m2()
	{
		 int n;
		 System.out.println("value of n");
		 n=sc.nextInt();
		 System.out.println("enter the values are....");
		 for(i=0;i<=n;i++)
		 {
			 //size=sc.nextInt();
			 //sum=sum+size;
			 System.out.println(i);
			 sum+=i;
		 }
		 
		  System.out.println("The sum is.. " +sum);	
	}
}
public class sum {

	public static void main(String[] args)
	{
			B a1=new B();
		    a1.m2();
			

	}

}






