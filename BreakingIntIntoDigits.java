import java.util.Scanner;

public class BreakingIntIntoDigits {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		 int num, temp, digit, count = 0;
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter any number:");
	        num = scanner.nextInt();
	        scanner.close();
	        temp = num;
	        //counting digits in the input number
	        while(num > 0)
	        {
	            num = num / 10;
	            count++;
	        }
	        while(temp > 0)
	        {
	            digit = temp % 10;
	            System.out.println("Digit at place "+count+" is: "+digit);
	            temp = temp / 10;
	            count--;
	        }
	}

}
