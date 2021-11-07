package bank_pr;
import java.util.Scanner;
import java.util.*;
public class mainClass
{
	int pin,ch,count=0;
	String ans;
	
	Scanner sc=new Scanner(System.in);
	//using Instance Initializer Block
	{
		System.out.println("Please Login First");
	}
	//creating private constructor 
	private mainClass()
	{
		System.out.println("--------------------------------");
		System.out.println("--------------------------------");
	}
	//using static block
	static
	{
		System.out.println("*****Welcome To My Bank*****");
		System.out.println("\t~~~~~~~~~~~~~~~~");
		
		
	}
	void display()
	{
		//using Lambda expression
//		xyz:
//		while(count<3)
//		{
		mainInterface aobj =()->{
			
			try
			{
				System.out.println("Please,Enter Your 4 Digit-PIN:");
				pin=sc.nextInt();
			}
			catch(Exception e)
			{
				System.out.println("--------------------------------");
				System.out.println("You Supposed To provide integer type input...Try again");
				
			}
			verifypin vp=new verifypin();
			boolean checkpinresult=vp.checkpin(pin);
			
			if(checkpinresult)
			{
				System.out.println("==========================");
				System.out.println("Login Success!!!");
				System.out.println("==========================");
				do
				{
					System.out.println("-------Bank_Menu--------");
					System.out.println("1.Withdraw Money");
					System.out.println("2.Deposite Money");
					System.out.println("3.Bank Balance Check");
					System.out.println("4.Submit Feedback");
					System.out.println("5.See Reviews");
					System.out.println("============================");
					System.out.println("Enter your choice: ");
					try
					{
						ch=sc.nextInt();
					}
					catch(Exception e)
					{
						System.out.println("Invalid Input Provided");
					}
					methodsSwitch ms=new methodsSwitch();
					try {
						ms.switchmethod(ch);
					} catch (Exception e)
					{
						
						System.out.println("Something went wrong");
					}
					System.out.println("Do You want to continue? [y/n]");
					ans=sc.next();
					
				  }while(ans.equals("y") || ans.equals("Y"));
				
				//break xyz;
			}
				
			else
			{
				System.out.println("===========================");
				System.out.println("Login Failed !!! Invalid Credential");
				System.out.println("===========================");
				count++;
			}
			if(count==3)
			{
				System.out.println();
				System.out.println("====================================");
				System.out.println("Your Account is Temporarily Blocked try after 24 hours");
				
				System.out.println("====================================");
			}
		};
		
		aobj.transaction();
		//}
		System.out.println("==============================================");
		System.out.println("Thank You for banking with us.Have Nice Day");
		System.out.println("==============================================");
		
	}
	public static void main(String[] args)
	{
		new mainClass().display();
	}
}
