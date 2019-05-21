
import java.util.Scanner;
public class StringsInAlphabeticalOrder
{
    public static void main(String[] args) 
    {
        int n;
        String temp;
        Scanner scan = new Scanner(System.in);
        //User will be asked to enter the count of strings 
        System.out.println("Enter number of strings ");
        n = scan.nextInt();
        String str[] = new String[n];
        System.out.println("Enter the Strings one by one:");
        for(int i = 0; i < n; i++)
        {
            str[i] = scan.nextLine();
        }
        scan.close();
         //Sorting the strings
        for (int i = 0; i < n; i++) 
        {
            for (int j = i + 1; j < n; j++) { 
                if (str[i].compareTo(str[j])>0) 
                {
                    temp = str[i];
                    str[i] = str[j];
                    str[j] = temp;
                }
            }
        }
        
        //Displaying the strings after sorting them based on alphabetical order
        System.out.print("Strings in Sorted Order:");
        for (int i = 0; i <= n - 1; i++) 
        {
            System.out.print(str[i] + ", ");
        }
    }
}
