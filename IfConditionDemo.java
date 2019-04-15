
public class IfConditionDemo {

	public static void main(String[] args)
	{
		int a=20;
		int b=30;
		int c=10;
		if(a>b)
		{
			if(a>c)
			{
				System.out.println("in the inner if loop");
			}
			else
			{
				System.out.println("in the inner else loop");
			}
		}
		else
		{
			if(b>c)
			{
				System.out.println("in the outer else loop");
			}
			else
			{
				System.out.println("in the outer else loop");
			}
		}

	}
}

