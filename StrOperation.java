/* Write a Java program to create a string in the form 
short_string + long_string + short_string from two strings. 
The strings must not have the same length.
Str1 = Python
Str2 = Tutorial
Sample Output:
PythonTutorialPython*/

public class StrOperation {

	public static void main(String[] args) 
	{
		 String str1 = "Python";    
			String str2 = "Tutorial"; 
			
			if(str1.length() >= str2.length())
				System.out.println( str2+str1+str2);
			else
			System.out.println(str1+str2+str1);	

	}

}
