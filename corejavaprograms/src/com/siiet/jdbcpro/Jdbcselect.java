package com.siiet.jdbcpro;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.*;  //step 1: input packages
 

public class Jdbcselect {

	public static void main(String[] args) {
		
		
	 //step 2:load and register driver	
		
	 //step3: Establish connection
		
		try {
		
     Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/siiet","root","greesh");
				
				//step 4: create Statement
     

		Statement st=conn.createStatement();
			
			    //step 5:execute query
			
			String strselect="Select booktitle,price,qty from books";
			
			//process result to display
			
			ResultSet rst=st.executeQuery(strselect);
			System.out.println("The records are");
			int rowcount=0;
			while(rst.next()) {
				
				String booktitle=rst.getString("booktitle");
				int price=rst.getInt("price");
				int qty=rst.getInt("qty");
				
				System.out.println(booktitle+""+price+""+qty);
				++rowcount; 
				}
			
		} catch(SQLException e) {
			//TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	
}


