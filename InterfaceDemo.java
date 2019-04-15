package inheritance;


class A1     
{
	void m(int a)
	{
		System.out.println("it is a superclass");
	}
}


class B1 extends A1
{
	void m1(int a,int b)
	{
		System.out.println("it is a subclass");
	}
}


interface inter
{
	void in();
}
class test extends B1 implements inter
{
	public void in()
	{
		System.out.println("it is interface class...");
	}
}

public class InterfaceDemo 
{
	public static void main(String[] args)
	{
		test ob=new test();
		ob.m(2);
		ob.m1(2, 3);
		ob.in();

	}

}
