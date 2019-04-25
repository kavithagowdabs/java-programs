
public class EquilateralTraingleDemo {

	public static void main(String[] args) {
	
		//equilateral triangle
		for(int i=1;i<=5;i++)//rows
		{
			for(int j=5;j>=i;j--)//spaces
			{
				System.out.print(" ");
			}
			for(int k=1;k<=2*i-1;k++)//stars
			{
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
	}

}
