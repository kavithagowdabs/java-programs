class StaticVar
{
	 static int cnt=0;
	StaticVar()
	{
		System.out.println(++cnt);
	}
}
public class staticvariableDemo {

	public static void main(String[] args)
	{
		StaticVar S=new StaticVar();
		StaticVar S1=new StaticVar();
		

	}

}
