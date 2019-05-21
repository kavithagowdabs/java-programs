
public class BinaryToOctal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String number = "10101";
		int bnum = Integer.parseInt(number, 2);
		String ostr = Integer.toOctalString(bnum);
		System.out.println("Octal Value after conversion is: "+ostr);

	}

}
