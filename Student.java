import java.io.*;
import java.util.*;
import java.sql.*;

public class Student
{
	public static void main(String args[])
	{
		String url = "jdbc:mysql://localhost:3306/it?zeroDateTimeBehavior=convertToNull";
		String user = "root";
		String password = "";
		Connection con = DriverManager.getConnection(url,user,password);
		Statement st = con.createStatement();
		String sql = "select * from student";
		ResultSet result = st.executeQuery(sql);
		while(result.next())
		{
			int StudId = result.getInt(1);
			String LastN = result.getString(2);
			String FirstN = result.getString(3);
			String Addr = result.getString(4);
			String Conc = result.getString(5);
			System.out.println("Student Id: " +StudId);
			System.out.println("Last Name: " +LastN);
			System.out.println("First Name: " +FirstN);
			System.out.println("Address: " +Addr);
			System.out.println("Concentration: " +Conc);
			System.out.println();
		}
	}
}