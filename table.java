package table;

import java.util.Scanner;

class table1
{
	int n,i,result=0;
	Scanner sc=new Scanner(System.in);
	void m()
	{
		System.out.println("enter table number");
		n=sc.nextInt();
		for(i=1;i<=10;i++)
		{
			result=n*i;
		System.out.println(n+"*"+i+"="+result);
		}
		
	}
}
public class table {

	public static void main(String[] args) {
		table1 t=new table1();
		t.m();

	}

}
