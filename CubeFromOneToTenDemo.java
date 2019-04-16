import java.util.Scanner;

public class CubeFromOneToTenDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		int res=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter val of n");
		n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			System.out.println("cube of " + i + " is " + (i*i*i));
		}
		
	}

}
