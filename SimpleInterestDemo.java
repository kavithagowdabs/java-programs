import java.util.Scanner;

public class SimpleInterestDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double p=0;
		double t=0;
		double r=0;
		double si=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter val of p");
		p=sc.nextDouble();
		System.out.println("enter val of t");
		t=sc.nextDouble();
		System.out.println("enter val of r");
		r=sc.nextDouble();
		si=(p*t*r)/100;
		System.out.println(si + " is the si");
		
	}

}
