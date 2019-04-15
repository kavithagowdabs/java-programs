class Employee
{
	int empId;
	String name;
	double salary;
	int data = 40;
	
	public Employee(int empId,String name,double salary){
		this.empId = empId;
		this.name = name;
		this.salary = salary;
		
	}
	public void initData(){
		
		int data = 20;
		
		System.out.println(this.data);
		
	}
	void display(){
		System.out.println(empId + " "+name+ " "+salary);
	}
}

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employee = new Employee(123,"Sandeep",30000.00);
		employee.initData();
		employee.display();

	}

}
