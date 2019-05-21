
public class StrToLong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "21111";
		String str2 = "-11111";
			
		//Conversion using parseLong(String) method
		long num = Long.parseLong(str);
		long num2 = Long.parseLong(str2);
		System.out.println(num+num2);	

	}

}
