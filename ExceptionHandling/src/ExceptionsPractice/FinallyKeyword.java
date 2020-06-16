//Example of Unchecked Exception, try and finally can be used for Unchecked Exceptions.

package ExceptionsPractice;

public class FinallyKeyword {
	
	public static void main(String[] args) {
		
		try
		{
		int a =10;
		int b=0;
		int c=a/b;
		System.out.println(c);
		}
		
		finally
		{
			System.out.println("final Code");
		}
		
	}

}
