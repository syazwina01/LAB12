package exercise7;


import java.io.BufferedWriter;
import java.io.FileWriter;

/*
 * Lab 12 - Exercise 7 (Processing Daily Rainfall Data from Selected Station using Character-Based Stream)
 * 
 * use BufferedWriter
 * RainFallDataWriter.java (package exercise 5)
 * 
 * @author Syazwina (B032120040)
 * 
 */

public class RainFallCharGenerator {

	public static void main (String [] args)
	{
		// 1. Identify the destination and declare output file
		String outFile = "RainfallChar.txt";
		try
		{		
			// 2. Construct BufferedWriter object together with FileWriter
			FileWriter files = new FileWriter(outFile);
			BufferedWriter bwOutput = new BufferedWriter(files);
			int [] array= {4,1,0,6,19,1};
			// 3. Write the data
			for (int index = 0; index < array.length; index++) {
				bwOutput.write(String.valueOf(array[index]));
				bwOutput.newLine();
			}
			
			
			// 4. Clear the stream
			bwOutput.flush(); 
			
			// 5. Close the stream
			bwOutput.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		// End of program
		System.out.println("End of program. Check out " + outFile); 
	}
	
}