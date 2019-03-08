

import java.sql.*;
import java.util.*;

public class Database {
	
	private ArrayList<String> result = new ArrayList<String>();
	public Database (String value) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/myschema", "root", "12345");
			Statement stmt = con.createStatement();
			
			ResultSet rs = stmt.executeQuery("select * \nfrom ERROR E\nwhere E.Code = '" + value + "';");
			while (rs.next())
			{
				//System.out.println(rs.getString(1) + "  " + rs.getString(2) + " " + rs.getString(3));
				result.add("ERROR CODE: " + rs.getString(1));
				result.add("ERROR DESCRIPTION: "+ rs.getString(2));
				result.add("ERROR SOLUTION: " + rs.getString(3));
			}
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	
	}


public ArrayList<String> getvalue()
{
	
	return result;
	
}}
	
	
