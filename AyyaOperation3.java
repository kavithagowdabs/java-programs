import java.util.Arrays;

/*
 Java program to get the larger value between first and last element
  of an array (length 3) of integers
 */
public class AyyaOperation3 {

	public static void main(String[] args)
	{
		 int[] a = {20, 30, 40};
		 System.out.println("Original Array: "+Arrays.toString(a)); 
		 int max_val = a[0];
		 if(a[2] >= max_val)
		 max_val = a[2];
		 System.out.println("Larger value between first and last element: "+max_val); 

	}

}
