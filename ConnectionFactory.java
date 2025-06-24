package bank;
import java.sql.*;

public class ConnectionFactory {
	// INSTANCE VARIABLE
	Connection con;
	Statement stmt;
public ConnectionFactory() {
	try {
		//  LOADING THE DRIVE 1st
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//Establish the Connection with database 2nd
		
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bankmanagement","root","mysql11");
		stmt=con.createStatement();
		
		
	}
	
	
	
	catch(Exception e) {
		e.printStackTrace();
	}
	}
}
