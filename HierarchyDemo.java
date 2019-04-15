package inheritance;

class P1  
{
	void m(int a)
	{
		System.out.println("it is a superclass");
	}
}


class Q1 extends P1
{
	void m1(int a,int b)
	{
		System.out.println("it is a subclass");
	}
}


class R1 extends Q1
{
	void m2(int a,int b)
	{
		System.out.println("it is a subclass");
	}
}




public class HierarchyDemo
{

	public static void main(String[] args)
	{
		R1 ob=new R1();
		ob.m(2);
		ob.m1(2, 3);
		ob.m2(1, 1);



	}

}
