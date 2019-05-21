import java.util.Scanner;

public class LargestOf3numsUsingTernary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1, num2, num3, result, temp;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter First,second n third Number:");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        num3 = scanner.nextInt();
        scanner.close();
        temp = num1 > num2 ? num1:num2;
        result = num3 > temp ? num3:temp;
        System.out.println("largest Number is:"+result);

	}

}
