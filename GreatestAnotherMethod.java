package geatest;
class GreaterNumber
{
	void m2()
	{
		int a=5,b=3,c=2;//local variable defined inside a method n it cannot be used other classes.
		if(a>b && a>c)
			System.out.println("greater" +a);//for print
		else if(b>c && b>a)
			System.out.println("greater" +b);
		else if(c>b && c>a)
			System.out.println("greater" +c);
		else
			System.out.println("all are same number");
	}
	
}

public class GreatestAnotherMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GreaterNumber ob=new GreaterNumber();
		ob.m2();
	}

}
