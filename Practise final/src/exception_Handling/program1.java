package exception_Handling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class program1 {

	public static void main(String[] args)  {
		try {
			FileInputStream fin= new FileInputStream("./test/data");
		} catch (FileNotFoundException e) {
			System.out.println(e);
			e.printStackTrace(); 
		}
		
		
		try
		{
			
		}
		
		catch(ArithmeticException e)
		{
			
		}
		catch(Exception e)
		{
			
		}
		finally
		{
			try {}
			catch(Exception e ){}
		}
		
	}

}
