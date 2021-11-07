package bank_pr;
import java.util.*;
public class methodsSwitch
{
	public void switchmethod(int i) throws Exception
	{
		switch(i)
		{
		    case 1:
		    	withdraw wd=new withdraw();
		    	wd.withdrawmethod();
		    	break;
		    case 2:
		    	depositeInterface dp=new deposite();
		    	dp.depositemethod();
		    	break;
		    case 3:
		    	balancecheckInterface bi=new balancecheck();
		    	bi.balancecheckmethod();
		    	break;
		    case 4:
		       submitfeedbackabstract afa=new submitfeedback();
		       afa.submitfeedbackmethod();
		       break;
		    case 5:
			       review rw=new review();
			       rw.reviewmethod();
		    	break;
		}
	}
}
