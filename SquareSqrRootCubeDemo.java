import java.util.Scanner;

public class SquareSqrRootCubeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter val of n");
		n=sc.nextInt();
		System.out.println("square of " + n + " is " + Math.pow(n,2));
		System.out.println("cube of " + n + " is " + Math.pow(n,3));
		System.out.println("square root of " + n + " is " + Math.sqrt(n));
	}

}
