import java.util.Scanner;

public class LeapYearDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter year");
		year=sc.nextInt();
		if(year%4==0)
		{
			System.out.println(year + "it is a leap year");
		}
		else
		{
			System.out.println(year + " it is not a leap year");
		}
	}

}
