package bank_pr;
import java.util.*;
public class deposite implements depositeInterface
{
	public void depositemethod()
	{
		Balance b = new Balance();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the amount you want to deposite: ");
		int amt=sc.nextInt();
		
		if(amt>0)
		{
			b.balance = b.balance + amt;
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
				System.out.println("Invalid input provided.");
				System.out.println("--------------------");
			}
		}
		else
		{
			System.out.println("***********************");
			System.out.println("Wrong input provided");
			System.out.println("***********************");
		}
	}
}
