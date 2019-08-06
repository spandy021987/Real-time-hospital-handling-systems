	package Package1;
	class Bank
	{
		void rateofInterest()
		{
			System.out.println("Eveey bank gives rate of interest");
		}
}
	class ICICI_Bank extends Bank
	{  void rateofInterest()
		{
		System.out.println("ICICI bank gives 8.50% rate");
	}}
	class Axis_bank extends Bank
	{  void rateofInterest()
		{
		System.out.println("Axis bank gives 9.50% rate");
	}
	}
	class Loan
	{
		static void edu_loan(Bank b)
		{
			b.rateofInterest();
		}
	}
public class Bank1 {
	public static void main(String[] args) {
		ICICI_Bank i1= new ICICI_Bank();
		Axis_bank a1= new Axis_bank();
		Loan.edu_loan(i1);
		Loan.edu_loan(a1);
	}

}
