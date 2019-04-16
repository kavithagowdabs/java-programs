
public class ExtractWordFromStrDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Hii am kavitha from mysore ";
		String word[]=str.split(" ",5);
		for(String words:word)
		{
			System.out.println(words);
		}
	}

}
