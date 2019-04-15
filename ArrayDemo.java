
public class ArrayDemo {

	public static void main(String[] args)
	{
		int n1=0;
		int n2=0;
		int a[]={2,3,4,5,6,7,8,9,10,11};
		for(int i=0;i<a.length;i++)
		{
			if(i%2==1)
			{
				n1++;
				System.out.println("values inside if "+i);
				//System.out.println("the values of n are...."+n1);
			}
			
			else
			{
				n2++;
				System.out.println("values inside else  "+i);
				//System.out.println(n2);
			}
		}

	}

}
