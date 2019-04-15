package abc;
public class ToweOfHanoi
{
	static void tower(int n,char from,char to,char temp)
	{
		if(n==1)
		{
			System.out.println("move disk 1 from " + from +" to "+ to);
			return;
		}
		tower(n-1,from,temp,to);
		System.out.println("move disk "+ n +" from "+ from +" to "+ to);
		tower(n-1,temp,to,from);
	}
	public static void main(String[] args)
	{
	int n=3;
	tower(n,'A','C','B');

	}

}
