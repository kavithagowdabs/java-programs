
public class ParallelogramTowardsRightDemo {

	public static void main(String[] args) 
	{
		
		//1.parallelogram tilted towards right
		for(int i=1;i<=5;i++)//rows
		{
			for(int j=1;j<=i;j++)//spaces
			{
				System.out.print(" ");
			}
			for(int k=1;k<=5;k++)//stars
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println();

		//2.parallelogram tilted towards left
		for(int i=1;i<=5;i++)//rows
		{
			for(int j=5;j>=i;j--)//spaces
			{
				System.out.print(" ");
			}
			for(int k=1;k<=5;k++)//stars
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	
	}

}
