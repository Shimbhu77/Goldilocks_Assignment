package com.assignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Question_3_Read_DB_JDBC {
		   
	 static String username = "root";
	 static String password = "Root";
	
	public static void main(String[] args) {
		
		 
			try {		
				Class.forName("com.mysql.cj.jdbc.Driver");
				
			} catch (ClassNotFoundException e) {	
				e.printStackTrace();
			}
			
			String url = "jdbc:mysql://localhost:3306/test";
			
			try( Connection conn=  DriverManager.getConnection(url, username,password)) {
			
			    Statement stmt=conn.createStatement();
			    
			    ResultSet rs=stmt.executeQuery("select emp.name,emp.age from emp");
			    
			    while(rs.next())
			    {
			    	String name = rs.getString("name");
			        int age = rs.getInt("age");
			        
			        System.out.println("name : "+name +" , age : "+age);
			    }
			    conn.close();
			  
	         }catch(SQLException e) {

				e.printStackTrace();
			}
		}
}		
