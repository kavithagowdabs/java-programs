import java.util.Scanner;

public class RemoveVowelFromStr {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str,strorig="";
		System.out.println("enter str");
		str=sc.nextLine();
		strorig=strorig+str.replaceAll("[aeiouAEIOU]","");
		System.out.println("After removing vowels from the str,the str becomes is.... " + strorig);
	}

}
