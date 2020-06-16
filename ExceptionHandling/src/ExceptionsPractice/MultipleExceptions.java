package ExceptionsPractice;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MultipleExceptions {

	@SuppressWarnings("resource")
	public void addition() throws IOException
	{
		try 
		
		{
			int a=10;
			int b=10;
			int c=a/b;
			System.out.println( "C Value is " +c);
			
		}
		
		catch (ArithmeticException A)
		{
			System.out.println("b value is 0");
		}
		
		try
		{
			File f=new File("D://ReadWrite.txt");
			FileReader fr=new FileReader(f);
			BufferedReader br=new BufferedReader(fr);
			String S=br.readLine();
			while(S!=null)
			{
				System.out.println(S);
				S=br.readLine();
			}
		}
		catch (FileNotFoundException e)
			{
				System.out.println("Error -> File not found");
				
			}
		catch (IOException i)
		{
			System.out.println("Error ->Unable to open the file");
		}
		
		}
	 public static void main(String[] args) {
		 MultipleExceptions me=new MultipleExceptions();
			try 
			{
				me.addition();
			} 
			catch (IOException e)
			{
				e.printStackTrace();
				System.out.println("IO Exception from Main Method");
			}
	 }
			
	 }

