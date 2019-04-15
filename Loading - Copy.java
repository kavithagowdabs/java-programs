package method_loading;

import java.util.Scanner;

class Meth_load
{
	
	Scanner sc=new Scanner(System.in);
	void load(double a,double r)
	{
		double c=a*r*r;
		System.out.println("area of the circle is\t" +c);
	}
	
	void load(int b,int d)
	{
		int e=b*d;
		System.out.println("rectangular value is\t" +e);
	}
	
	void load(int b)
	{
		int e=b*b;
		System.out.println("area of square is\t" +e);
	}
}

public class Loading {

	public static void main(String[] args) 
	{
		Meth_load ob=new Meth_load();
		ob.load(3.14,2.2);
		ob.load(2,3);
		ob.load(2);
	}

}
