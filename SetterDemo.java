class Student
{
	int studentId;
	String name;
	String branch;
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}

}
public class SetterDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s  = new Student();
		s.setStudentId(123);
		s.setName("John");
		s.setBranch("Computers");
		
		System.out.println(s.getBranch());
		System.out.println(s.getName());
		
		System.out.println(s.getStudentId());
		
		

	}

}
