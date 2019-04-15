package abc;
import java.util.Scanner;

class stu{
	String name;
	int stu_id;
	int Stu_age;
	Scanner sc=new Scanner(System.in);
	void Stu_det()
	{
		System.out.println("enter student name");
		name=sc.next();
		System.out.println("Enter stu id ");
		stu_id=sc.nextInt();
		System.out.println("Enter stu age");
		Stu_age=sc.nextInt();
		
	}
}

class marks extends stu{
	int m1,m2,m3,sum=0,avg=0;
	
	void Stu_mar()
	{
		System.out.println("Enter stu marks for 3 subjects");
		m1=sc.nextInt();
		m2=sc.nextInt();
		m3=sc.nextInt();
		sum=m1+m2+m3;
		avg=sum/3;	
		//System.out.println("average is\n"+avg);
		
	}
}

interface inter{
	int h=5,w=56,rate=4;
	void sports_det();
}

class test extends marks implements inter
{
	
	public void sports_det() {
	System.out.println("----The Student Details is----");	
	System.out.println("The name is.."+name);
		System.out.println("The Student ID.."+stu_id);
		System.out.println("The Student age...."+Stu_age);
		System.out.println("The Total marks.."+sum);
		System.out.println("The Percentage is..."+avg);
		System.out.println("The height..."+h);
		System.out.println("The weight is.."+w);
		System.out.println("The ratingg is.."+rate);
		if(avg<=100 && avg>=85)
		{
			System.out.println("Distinction");
		}
		else if(avg<=85 && avg>=65){
			System.out.println("First Class ");
		}
		else if(avg<=65 && avg>=45){
			System.out.println("second class");
		}
		else{
			System.out.println("fail");
		}
			
			
		
	}
	
}
public class interface12 {

	public static void main(String[] args) 
	{
		test ob=new test();
		ob.Stu_det();
		ob.Stu_mar();
		ob.sports_det();
		

	}

}
