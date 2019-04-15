class EmployeeEx
{
	int empId;
	int a=5;
	EmployeeEx(int empId)
	{
		this.empId=empId;
	}
	
	void display()
	{
		int a=10;
		System.out.println(a+" is the value of a");
		System.out.println("the instance variable value is "+this.a);
		System.out.println("the emp id is "+empId);
	}
}
public class ExamplefoThis
{

	public static void main(String[] args) 
	{
		EmployeeEx e=new EmployeeEx(123);
		e.display();
		

	}

}
