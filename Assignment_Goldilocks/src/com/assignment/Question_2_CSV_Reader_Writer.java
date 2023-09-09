package com.assignment;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Question_2_CSV_Reader_Writer {

	public static void main(String[] args) {
		
		try {
			
			BufferedReader reader = new BufferedReader(new FileReader("input.csv"));
			
			PrintWriter writer = new PrintWriter(new FileWriter("output.csv"));
			
			String line = reader.readLine();
			
			while(line!=null)
			{
				System.out.println("input line : "+line);
				
				String[] values = line.split(",");
				
				double sum = 0;
						
				for(String value : values)
				{
					double number = Double.parseDouble(value);
					
					sum = sum + number;
				}
				
				writer.write(line+" , "+sum);
				
				System.out.println("output line : "+line+","+sum);
				
				writer.println();
				
				line = reader.readLine();
				
			}
			
			reader.close();
			
			writer.close();
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
			
		} catch (IOException e) {
			
			e.printStackTrace();
			
		}
		
	}
}
