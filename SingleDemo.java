package inheritance;

class A      
{
	void m(int a)
	{
		System.out.println("it is a superclass");
	}
}


class B extends A
{
	void m1(int a,int b)
	{
		System.out.println("it is a subclass");
	}
}


public class SingleDemo
{

	public static void main(String[] args) 
	
	{
		B ob=new B();
		ob.m(2);
		ob.m1(2, 3);
		//ob.m2(1, 1);

	}

}
