
class Employee
{
	int empId=1;
	Employee(int empId)
	{
		this.empId=empId;
	}
	void display()
	{
		System.out.println("the empid is "+empId);
	}
	
}
public class Employeee {

	public static void main(String[] args)
	{
	Employee e=new Employee(2);
	e.display();

	}

}
