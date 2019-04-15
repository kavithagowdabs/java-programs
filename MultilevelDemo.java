package inheritance;

class A12
{
	//int a=10;
	int num;
	A12()
	{
		System.out.println("the constructor...");
	}
	
	void m(int num)
	{
		this.num=num;
		System.out.println("method id..");
	}
}

class B21 extends A12
{
	B21()
	{
		//super();
	}
}


public class MultilevelDemo
{
	public static void main(String[] args)
	{
		B21 ob=new B21();
		//ob.m(12);

	}

}
