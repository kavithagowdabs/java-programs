import java.util.Scanner;

public class SmallestOf3NumsUsingTernary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1, num2, num3, result, temp;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter First,second n third Number:");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        num3 = scanner.nextInt();
        scanner.close();
        
        /* In first step we are comparing only num1 and
         * num2 and storing the smallest number into the
         * temp variable and then comparing the temp and
         * num3 to get final result.
         */
        
        temp = num1 < num2 ? num1:num2;
        result = num3 < temp ? num3:temp;
        System.out.println("Smallest Number is:"+result);

	}

}
