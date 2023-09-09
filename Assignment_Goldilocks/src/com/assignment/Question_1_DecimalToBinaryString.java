package com.assignment;

import java.util.Scanner;

public class Question_1_DecimalToBinaryString {
	
    public static String decimalToBinary(String numberValue) {
        try {
            
            int intValue = Integer.parseInt(numberValue);
            
            if (intValue < 0) {
            	
                throw new IllegalArgumentException("Input must be Positive number.");
            }
            
             StringBuilder stringBuilder = new StringBuilder();
            
            while(true)
            {
            	int ans = intValue%2;
            	
            	intValue = intValue/2;
            	
            	stringBuilder.append(ans);
            	
            	if(intValue==1)
            	{
            		stringBuilder.append(intValue);
            		
            		break;
            	}	
            }
            
            return stringBuilder.reverse().toString();
            
        } catch (NumberFormatException e) {
        	
            return "Invalid input. Please enter a valid decimal number.";
            
        } catch (IllegalArgumentException e) {
            
            return e.getMessage();
            
        }
    }

    public static void main(String[] args) {
    	
    	Scanner sc  = new Scanner(System.in);
    	
    	System.out.println("Enter a Decimal Number : " );
    	
        String decimalString = sc.next();
        
        String binaryString = decimalToBinary(decimalString);
        
        System.out.println("Binary Value is : " + binaryString);
    }
}
