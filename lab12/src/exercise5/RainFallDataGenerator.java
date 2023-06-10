package exercise5;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;


/*
 * Lab 12 - Exercise 5 (Task B: Implementation of Data Creation)
 * 
 * Generates data for 6 days of daily rainfall
 * output file: "RainFall.txt", DataOutputStream.
 * 
 * @author Syazwina (B032120040)
 * 
 */

public class RainFallDataGenerator {

	public static void main (String [] args)
	{
		// 1) Declare output file
		String outFile = "Rainfall2.txt";
		
		try
		{
			// 2) Create output stream between this program and output file, outFile
			DataOutputStream dosOutput = new DataOutputStream(new FileOutputStream(outFile));
			
			// 3) Write the 6 days reading of daily rainfall - 3 June 2023 to  8 June 2023
			dosOutput.write(4);
			dosOutput.write(1);
			dosOutput.write(0);
			dosOutput.write(6);
			dosOutput.write(19);
			dosOutput.write(1);
			
			// 4. Clear stream
			dosOutput.flush();
			
			// 5. Close stream
			dosOutput.close(); 
			
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
		
		// End of program
		System.out.println("End of program. Check out " + outFile); 
	}
}