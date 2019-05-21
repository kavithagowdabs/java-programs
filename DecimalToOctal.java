import java.util.Scanner;

public class DecimalToOctal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner( System.in );
	    System.out.print("Enter a decimal number : ");
	    int num =input.nextInt();
	    String octalString = Integer.toOctalString(num);
	    System.out.println("Method 1: Decimal to octal: " + octalString);
	    // For storing remainder
	    int rem;
	    // For storing result
	    String str=""; 
	 
	    // Digits in Octal number system
	    char dig[]={'0','1','2','3','4','5','6','7'};
	 
	    while(num>0)
	    {
	       rem=num%8; 
	       str=dig[rem]+str; 
	       num=num/8;
	    }
	    System.out.println("Method 2: Decimal to octal: "+str);

	}

}
