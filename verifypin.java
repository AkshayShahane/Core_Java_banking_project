package bank_pr;

public class verifypin 
{
	public boolean checkpin(int pin)
	{
		boolean pinresult=false;
		switch(pin)
		{
			case 1111:
				pinresult=true;
				break;
			case 2222:
				pinresult=true;
				break;
			case 3333:
				pinresult=true;
				break;
			case 4444:
				pinresult=true;
				break;
					}
		return pinresult;
	}
}
