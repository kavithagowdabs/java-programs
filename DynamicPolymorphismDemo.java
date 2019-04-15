class Account
{
	String accName;
	String accNum;
	void getDetails()
	{
		System.out.println("In the account class");
		
	}
}
class SavingsAcc extends Account
{
	boolean debitCard;
	void getDetails()
	{
		System.out.println("In the savings accnt");
	}
}
public class DynamicPolymorphismDemo {

	public static void main(String[] args) {
	
		Account a=new Account();
		a.getDetails();
		//a.accName="kavi";
		//a.accNum="12";
		//System.out.println(accName+" "+accNum);
		a=new SavingsAcc();
		//a.debitCard=true;
		a.getDetails();
		

	}

}
