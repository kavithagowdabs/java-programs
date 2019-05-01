import java.util.Scanner;

public class PrintAlternativeStrElem {

	public static void main(String[] args) {
		String s;
		String str="";
		Scanner sc=new Scanner(System.in);
		System.out.println("enter str");
		s=sc.nextLine();
		for(int i=0;i<s.length();i+=2)
		{
			str=str+s.charAt(i);
		}
		System.out.println(str);

	}

}
