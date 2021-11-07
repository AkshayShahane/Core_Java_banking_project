package bank_pr;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.FileReader;
public class submitfeedback extends submitfeedbackabstract
{
	String txt;
	Scanner sc=new Scanner(System.in);
	public void submitfeedbackmethod() throws Exception
	{
		FileWriter fw=new FileWriter("D:\\other\\file1.txt",true);
		System.out.println("Please Enter Your Feedback: ");
		//sc.nextLine();
		this.txt=sc.nextLine();
		fw.write(this.txt);
		//System.out.println("?????");
		System.out.println("Successfully Entered Feedback in the file");
		fw.close();
	}
		
	
}
