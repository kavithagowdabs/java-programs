package geatest;

class GreaterNum
{
	void m2()
	{
		int a=5,b=3,c=2;//local variable defined inside a method n it cannot be used other classes.
		if(a>b)
			System.out.println("greater" +a);//for print
		else if(a>c)
			System.out.println("greater" +a);
		else if(b>c)
			System.out.println("greater" +b);
		else
			System.out.println("greater" +c);
	}
	
}

public class GreatestDemo {

	public static void main(String[] args)
	{
		GreaterNum a1=new GreaterNum();
		a1.m2();

	}

}
