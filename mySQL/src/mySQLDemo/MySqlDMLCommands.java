package mySQLDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * Prerequisite: - Java Installation; Eclipse as IDE and My SQL- JDBC driver
 * Following steps we need to be follow, IN ORDER TO USE SQL DML (DATA MANIPULATION LANGUAGE) COMMAND THROUGH JDBC : -
 * 1. Create a Connection to database
 * 2. Create statements / queries
 * 3. Execute statements / queries
 * 4. Store the results in result set ==> USE this step when using SELECT commands
 * 		SELECT commands is the DATA QUERY / DATA RETRIEVAL LANGUAGE (DQL / DRL)
 * 5. Close connection
 */

public class MySqlDMLCommands{
	
	public static void main(String[] args) throws SQLException {
		
		// 1. Create a Connection to database
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "root");
		
		// 2. Create statements / queries
		Statement stmt = con.createStatement();
		
		// String s = "INSERT INTO STUDENT VALUES(107, 'SMITH')"; // ---> Using INSERT Command
		// String s = "UPDATE STUDENT SET SNAME = 'DAVID' WHERE SID = 107"; // ---> Using UPDATE Command
		 String s = "DELETE FROM STUDENT WHERE SID=103 AND SNAME='ABC' "; // ---> Using DELETE Command
		
		// 3. Execute statements / queries
		stmt.execute(s);
		
		// 4. Store the results in result set ==> USE this step when using SELECT commands
		// See MySqlDMLSelect
		
		// 5. Close connection
		con.close();
		
		System.out.println("Query Executed.........");
		
	}
	
}