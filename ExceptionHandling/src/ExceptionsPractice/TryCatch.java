package ExceptionsPractice;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.testng.reporters.jq.Main;

public class TryCatch {
	
	@SuppressWarnings("resource")
	public void exceptionhandler() 
	{
	
	File f;
	FileReader fr;
		
		try 
		{
		 f=new File("D://ReadWrite.txt");
		 fr=new FileReader(f);
		}
		
		
		catch (FileNotFoundException e)
		{
			System.out.println("Error -> File not found");
			
		}
		try
		{
		f=new File("D://ReadWrite.txt");
		fr=new FileReader(f);
		BufferedReader br=new BufferedReader(fr);
		String S=br.readLine();
		while(S!=null)
		{
		System.out.println(S);
		S=br.readLine();
		}
		}
		catch (IOException i)
		{
			System.out.println("Error ->Unable to open the file");
		}
		
	}
	
 public static void main(String[] args) {
	TryCatch tc=new TryCatch();
	tc.exceptionhandler();
}

}
