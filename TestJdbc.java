package com.thekiranacademy;

import java.sql.*;

public class TestJdbc {

	public static void main(String[] args) throws Exception 
	{

		
	//	Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/fournineeight","root","root");
		
		System.out.println("Connected to database");
		  
		Statement st=con.createStatement();
		
		// st.executeUpdate("insert into employee values(5,'raman',80000)");
		
		//st.executeUpdate("update employee set name='rocky',salary=60000 where eid=5");
		
		st.executeUpdate("delete from employee where eid=5");
				
		System.out.println("Done");
		
	    
		
		

	}

}
