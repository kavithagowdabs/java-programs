import java.util.Arrays;

/*
 find the largest element between first, last, and middle values
  from an array of integers (even length)
 */
public class ArrayOperation5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] a = {20, 30, 40, 50, 67};
		 System.out.println("Original Array: "+Arrays.toString(a)); 
		 int max_val = a[0];
		 if(max_val <= a[a.length-1])
		 max_val = a[a.length-1];
		 if(max_val <= a[a.length/2])
		 max_val = a[a.length/2];
		 System.out.println("Largest element between first, last, and middle values: "+max_val);  

	}

}
