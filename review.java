package bank_pr;
import java.io.*;
public class review 
{
	public void reviewmethod() throws Exception
	{
		FileReader fr=new FileReader("D:\\other\\file1.txt");
		int i;
		System.out.println("=--===--=--===--Our Valuable Reviews=--===--");
		System.out.println();
		while((i=fr.read())!=-1)
		{
			System.out.print((char)i);
		}
		System.out.println();
		System.out.println("=--===--=--===--=--===--=--===");
	}
}
