
public class MirrorImageOfEquilateralDemo
{

	public static void main(String[] args)
	{
	
		//2. mirror image of equilateral  
		
				for(int i=1;i<=5;i++)//rows
				{
					for(int j=1;j<=i;j++)//spaces
					{
						System.out.print(" ");
					}
					for(int k=5;k>=2*i-1;k--)//stars
					{
						System.out.print("*");
					}
					System.out.println();
				}
				
			}

	}


