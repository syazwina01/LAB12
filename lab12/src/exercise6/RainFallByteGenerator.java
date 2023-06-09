package exercise6;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

/*
 * Lab 12 - Exercise 6 (Processing Daily Rainfall Data from Selected Station using Byte-Based Stream)
 * 
 * byte-based stream
 * DataOutputStream.class
 * 
 * @author Syazwina (B032120040)
 * 
 */


public class RainFallByteGenerator {
	
	public static void main (String [] args)
	{
		// 1) Declare output file 
		String outFile = "RainfallByte.txt";
		
		// DECLARE DATA
		// Station id
		int id[] = {2421003, 2322006, 2321006, 2222002, 2424031, 2324032};
		
		// Station name
		String stations[] = {"Simpang Ampat", "Melaka Pindah", "Ladang Lendu", "Durian Tunggal", "Datoh Kramat di Nyalas Melaka", "Ldg. Sing Lian di Bkt. Senggeh Melaka"};
		
		// district name
		String district[] = {"Alor Gajah", "Alor Gajah", "Alor Gajah", "Alor Gajah", "Jasin", "Jasin"};
		
		// READING ON
		//3 June 2023
		double readings1[] = {4.0, 0.0, 2.0, 0.0, 0.0, 0.0};
		
		//4 June 2023
		double readings2[] = {1.0, 0.0, 0.0, 0.0, 0.0, 0.0};
		
		//5 June 2023
		double readings3[] = {0.0, 0.0, 0.0, 0.0, 0.0, 0.0};
		
		//6 June 2023
		double readings4[] = {6.0, 2.0, 3.0, 37.0, 0.0, 0.5};
		
		//7 June 2023
		double readings5[] = {19.0, 18.5, 4.0, 6.0, 17.0, 4.5};
		
		//8 June 2023
		double readings6[] = {1.0, 2.5, 0.0, 9.0, 0.0, 0.0};
		
		try {
			
			// 2) Create output stream (read data)
			DataOutputStream dosOut = new DataOutputStream(new FileOutputStream(outFile));
			
			// Process data
			for (int index = 0; index < stations.length; index++) {
				
				// 3) Write data into data stream
				dosOut.writeInt(id[index]);
				dosOut.writeUTF(stations[index]);
				dosOut.writeUTF(district[index]);
				dosOut.writeDouble(readings1[index]);
				dosOut.writeDouble(readings2[index]);
				dosOut.writeDouble(readings3[index]);
				dosOut.writeDouble(readings4[index]);
				dosOut.writeDouble(readings5[index]);
				dosOut.writeDouble(readings6[index]);
				
				// 4) Flush for each writing
				dosOut.flush();
			}
			
			// 5) Close stream
			dosOut.close();
			
		} catch (Exception ex) {
			
			ex.printStackTrace();
		}
		
		// end of program
		System.out.println("End of program. Check out " + outFile); 
	}
}