import java.util.Scanner;

public class add {
	
	void sum(){
		int i;
		for(i=0;i<5;i++) {
		System.out.println("sum of values");
		}
	}
	
	void 
	display()
	{
		int ch=0;
		switch(ch)
		{
		case 1:
			System.out.println("values");
			break;
			default:
				System.out.println("error");
			
		}
	}

	void swap()
	{
		int temp,a=5,b=10;
		temp=a;
		a=b;
		b=temp;
		System.out.println("swapping values" +b);
	}
	public static void main(String[] args) {
		
		int c,d,b,a=5
				;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of a");
		System.out.println("enter the value of b ");
		b=sc.nextInt();
		System.out.println("the value of b\n" +b);
		c=a+b;
		System.out.println("the value of c\n" +c);
		d=c;
		System.out.println("the value of d\n"+d);
		
		add kavi=new add();
		kavi.sum();
		add kavi1=new add();
		kavi1.display();
		kavi1.swap();
		if(a>b)
		{
			System.out.println("greater"+a);
		}
		else
			System.out.println("lesser"+b);

			}
}
