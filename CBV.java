class SwapDemo
{
	void swapData(int x,int y){
		
		System.out.println("Before swapping x="+x+ "y="+y);
		int temp = x;
		x = y;
		y  = temp;
		
		System.out.println("After swapping x="+x+ "y="+y);
		
	}
}
public class CBV {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 20;
		int b = 30;
		SwapDemo s = new SwapDemo();
		
		System.out.println("Before swapping a="+a+ "b="+b);
		s.swapData(a, b);
		System.out.println("After swapping a="+a+ "b="+b);

	}

}
