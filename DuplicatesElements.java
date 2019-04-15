package abc;

public class DuplicatesElements 
{

	public static void main(String[] args)
	{
		int a[]={1,2,5,5,2,7,8,8};
		for(int i=0;i<a.length;i++)
		{
			for(int j=i;j<a.length;j++)
			{
				if(a[i]==a[j] && i!=j)
				{
					System.out.println("Duplicates elements are..."+a[j]);
				}
			}
		}

	}

}
