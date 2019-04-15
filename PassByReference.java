class Reference
{
	String color;
	void setColor(Reference r)
	{
		r.color="lightblue";
	}
}
public class PassByReference {

	public static void main(String[] args)
	{
		Reference r1=new Reference();
		r1.color="pink";
		System.out.println("before "+r1.color);
		r1.setColor(r1);
		System.out.println("after "+r1.color);
		

	}

}
