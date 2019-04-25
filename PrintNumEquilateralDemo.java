
public class PrintNumEquilateralDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1;i<=5;i++)//rows
		{
			for(int j=5;j>=i;j--)//spaces
			{
				System.out.print(" ");
			}
			for(int k=1;k<=2*i-1;k++)//stars
			{
				System.out.print(k);
			}
			System.out.println();
		}
		System.out.println();
	}

}
