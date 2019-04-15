package inheritance;

class P    
{
	void m(int a)
	{
		System.out.println("it is a superclass");
	}
}


class Q 
{
	void m1(int a,int b)
	{
		System.out.println("it is a subclass");
	}
}


class R extends Q
{
	void m2(int a,int b)
	{
		System.out.println("it is a subclass");
	}
}


public class MultipleDemo
{

	public static void main(String[] args) 
	{
		R ob=new R();
		//ob.m(2);
		ob.m1(2, 3);
		ob.m2(1, 1);


	}

}
