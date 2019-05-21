import java.util.Arrays;

/*
 rotate an array (length 3) of integers in left direction
 */
public class ArrayElemRotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {20, 30, 40};
		System.out.println("Original Array: "+Arrays.toString(a)); 
		int[] a1 = {a[1], a[2], a[0]};
		System.out.println("Rotated Array: "+Arrays.toString(a1)); 	 

	}

}
