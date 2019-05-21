
public class OctalToDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String onum = "157";
		
		//octal to decimal using Integer.parseInt()
		int num = Integer.parseInt(onum, 8);
			
		System.out.println("Decimal equivalent of Octal value 157 is: "+num);

	}

}
