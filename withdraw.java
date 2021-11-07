package bank_pr;

public class withdraw extends Balance
{
	public void withdrawmethod()
	{
		System.out.println("Enter the amount you want to withdraw: ");
		int amt=sc.nextInt();
		if(amt<=balance)
		{
			balance = balance - amt;
			System.out.println("++++++++++++++++++++++");
			System.out.println("Transaction Completed Successfully");
			System.out.println("++++++++++++++++++++++");
			System.out.println("Do you want to See your Account Balance: [y/n]");
			String ans=sc.next();
			if(ans.equals("y") || ans.equals("Y"))
			{
				balancecheck b=new balancecheck();
				b.balancecheckmethod();
			}
			else if(ans.equals("n") || ans.equals("N"))
			{
				System.out.println("--------------------");
				System.out.println("Ok.Thank you");
				System.out.println("--------------------");
			}
			else
			{
				System.out.println("--------------------");
				System.out.println("Invalid input provided");
				System.out.println("--------------------");
			}
		}
		else
		{
			System.out.println("++++++++++++++++++++++");
			System.out.println("Insufficient Balance");
			System.out.println("++++++++++++++++++++++");
		}
	}
}
