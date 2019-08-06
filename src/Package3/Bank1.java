package Package3;
interface Bank
{
	void account();
	void transaction();
}
interface Syndicate  extends Bank
{
	void withdraw();
	
}
class Bank1 implements Syndicate
{
	public void account()
	{
		System.out.println("A person can open an account in a bank");
		
	}
	public void transaction()
	{
		System.out.println("Transactions like withdrawal,checking the balance can be done in ATM or banks");
	}
public void withdraw()
{
	System.out.println("Money can be withdrawn");
	
}


	public static void main(String[] args)
	{
		Bank1 b1= new Bank1();
		b1.account();
		b1.transaction();
		b1.withdraw();
	}
}


