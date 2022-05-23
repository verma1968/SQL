package mySQLDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MySqlDMLSelect {

	public static void main(String[] args) throws SQLException {
		
		// 1. Create a Connection to database
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hr", "root", "root");
				
				// 2. Create statements / queries
				Statement stmt = con.createStatement();
				
				String s = "SELECT employee_id,first_name,last_name FROM employees"; // ---> Using SELECT Command

				
				// 3. Execute statements / queries
				// 4. Store the results we need to use special class called result set 
				ResultSet rs = stmt.executeQuery(s);  // <-- This line will return or give result set 
				
				// Now we want those results to be print in the console as an output
				// So, we will use while loop
				while (rs.next()) {
					int eid = rs.getInt("Employee_ID");
					String fname = rs.getString("First_name");
					String lname = rs.getString("Last_name");
					
					System.out.println(eid + "   " + fname + "  " + lname + "  ");
				}
			
				
				// 5. Close connection
				con.close();
				
				System.out.println("Query Executed.........");

	}

}
