import java.util.Arrays;

/*
 Java program to swap the first and last elements of an array
  (length must be at least 1) and create a new array
 */
public class AyyaOperation4 {

	public static void main(String[] args) 
	{
		 int[] a = {20, 30, 40};
			System.out.println("Original Array: "+Arrays.toString(a)); 
			int x = a[0];
			a[0] = a[a.length-1];
			a[a.length-1] = x;
			System.out.println("after swaping the first n last elements: "+Arrays.toString(a));

	}

}
