class Employee1
{
	void m()
	{
	System.out.println("in the super class");
	}
}
class Manager extends Employee1
{
	
}

class TaxComputation
{
	void calc(Employee1 e)
	{
		if(e instanceof Manager)
		{
			System.out.println("20%");
		}
	}
}
public class InstanceOfDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager obj=new Manager();
		obj.m();
		TaxComputation t=new TaxComputation();
		t.calc(obj);

	}

}
