package abc;

class A{
	void print(double d,double e)
	{
		System.out.println("the value of variable a is..."+d+e);
	}
	/*void print(int a,int b){
		System.out.println(a+b+"The value of a and b are...");
	}*/
	void print(int a,int b,int c){
		System.out.println("The value of a b c are.."+a+b);
	}
	void print(int a,int b){
		System.out.println("The value of a b c are.."+b+a);

	}
}

public class Method_Overloading {

	public static void main(String[] args) {
		A ob=new A();
		ob.print(67.9, 56.4);
		ob.print(3, 9);
		//ob.print(2, 7, 8);
		ob.print(2, 45.7);
	}

}
