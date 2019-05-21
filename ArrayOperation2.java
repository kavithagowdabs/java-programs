/*
  test if the first and the last element of an array of integers are same.
  The length of the array must be greater than or equal to 2. Go to the editor
  Test Data: array = 50, -20, 0, 30, 40, 60, 10
  Sample Output:
  false
 */
public class ArrayOperation2 {

	public static void main(String[] args)
	{
		 int[] a = {50, -20, 0, 30, 40, 60, 10};
		 System.out.println (a.length >= 2 && a[0] ==  a[a.length-1]);

	}

}
