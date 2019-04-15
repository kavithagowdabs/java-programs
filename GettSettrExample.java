class Student
{
	int Id;

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		this.Id = id;
	}
	
}
public class GettSettrExample {

	public static void main(String[] args)
	{
	Student s=new Student();
	s.setId(1);
	System.out.println(s.getId());

	}

}
