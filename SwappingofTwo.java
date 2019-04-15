class Swap
{
	void swapTwo(int x,int y)
	{
		
		int temp=x;
		x=y;
		y=temp;
		System.out.println("after swapping of  " +x+" and "+y+ " is = " +x+" "+y);
	}
}
public class SwappingofTwo 
{

	public static void main(String[] args)
	{
	int a=10;
	int b=20;
	System.out.println("before swapping of a and b is = " +a+" "+b);
	Swap s=new Swap();
	s.swapTwo(a, b);
	System.out.println("after swapping of " +a+" and "+b+ " is = " +a+" "+b);
	}

}
