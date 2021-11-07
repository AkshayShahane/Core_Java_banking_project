package bank_pr;

public class balancecheck implements balancecheckInterface
{
	public void balancecheckmethod()
	{
		Balance b= new Balance();
		System.out.println("++++++++++++++++++++++++++++++++++++++++");
		System.out.println("Your available balance is: "+b.balance);
		System.out.println("++++++++++++++++++++++++++++++++++++++++");
	}
}
