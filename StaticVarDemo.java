class Counter
{
	static int count = 0;
	static String name = "John";
	 Counter(){
		System.out.println(++count);
	}
	static void display(){
		System.out.println("Name is "+name);
	}
}
public class StaticVarDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Counter c1 = new Counter();
		Counter c2= new Counter();
		Counter c3 = new Counter();
		
		Counter.display();

	}

}
