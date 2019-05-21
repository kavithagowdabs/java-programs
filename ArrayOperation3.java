import java.util.Arrays;

/*
 test that a given array of integers of length 2 contains a 4 or a 7
 */
public class ArrayOperation3 {

	public static void main(String[] args)
	{
		 int[] a = {5, 7};
		 System.out.println("Original Array: "+Arrays.toString(a)); 
		 if(a[0] == 4 || a[0] == 7)
		 System.out.println("True");
		 else
		 System.out.println(a[1] == 4 || a[1] == 7);

	}

}
