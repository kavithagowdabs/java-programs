package abc;

import java.util.Scanner;

public class PrintPrimeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,states=1,num=3,cnt,j;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter prime num");
		n=sc.nextInt();
		if(n>=1)
		{
			System.out.println("first "+n+" prime numbers are....");
		}
		for(cnt=2;cnt<=n;cnt++)
		{
			for(j=2;j<=Math.sqrt(num);j++)
			{
				if(num%j==0)
				{
					states=0;
					break;
				}
			}
			if(states!=0)
			{
				System.out.println(num);
				cnt++;
			}
			states=1;
			num++;
		}
	}

}
