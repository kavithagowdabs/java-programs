/*
  test if 10 appears as either the first or last element of an array of integers. 
  The length of the array must be greater than or equal to 2.
  Test Data: array = 10, -20, 0, 30, 40, 60, 10
  true
 */
public class ArrayOperation1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num_array = {10, -20, 0, 30, 40, 60, 10};
	    System.out.println((num_array[0] == 10 || num_array[num_array.length-1] == 10));	

	}

}
