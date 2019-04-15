package bank;

import java.util.Scanner;

class bankingdetails
{
	Scanner sc=new Scanner(System.in);
	int accno=1234556777;
	int intialpinnum=120,min=500;
	String name="abc";
	int total=0,total1=0;
	int ch=1,balance=5000;
	int phone=878965756;
	void bankingdetails()
	{
		
		System.out.println("name of the applicant\n" +name);
		System.out.println("the account num is\n"+accno);
		System.out.println("phone number of applicant is"+phone);
		System.out.println("initial total balance " +balance);
		System.out.println("after the deposted,total balance "+total);
		System.out.println("after withdraw,then the total balance"+total1);
		
	}
	void m()
	{
		//Scanner sc=new Scanner(System.in);
		
		
		System.out.println("enter the choice");
		ch=sc.nextInt();
		System.out.println("1.deposite\t2.withdraw\t3.balance\t4.exit\n");
		if(intialpinnum==120)
		{
			switch(ch)
			{
			case 1://System.out.println("the total balance is"+balance);
					int depo;
					System.out.println("the amount is to deposit");
					depo=sc.nextInt();
					System.out.println("the deposited amount is added with total balance,so the total balance after adding deposited value .....");
					total=depo+balance;
					System.out.println(depo+"+"+balance+"="+total);
					System.out.println("successfully deposited");
					break;
			case 2:
				    if(min==500 && min>=500)
					{
				       System.out.println("u can withdraw from total balance");
				       total1=total-min;
				       System.out.println("the total balance now"+total1);
				       break;
					}
					else
					{
						System.out.println("u can not withdraw");
					}
			case 3:	
					 System.out.println("Banking applicant balance details are\n");
					 bankingdetails();
					 break;
			case 4:System.out.println("not proprer applicant");
					
					 
			}
		}
		
		
	}
	
}
public class bank {

	public static void main(String[] args) 
	{
	
		bankingdetails b=new bankingdetails();
		b.m();
	}
		
}				

