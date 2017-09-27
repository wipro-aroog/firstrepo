package db;

import java.sql.*;
import java.util.Scanner;

public class delete{

	public static void main(String[] args) {
		
		
		//Establish Connection
		Connection con = null;
		String url="jdbc:oracle:thin:@localhost:1521:orcl";
		String uname="scott";
		String pwd="tiger";
		try {
			con = DriverManager.getConnection(url,uname,pwd);
			System.out.println("Connected");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Create a Statement object
		try {
			Statement st = con.createStatement();
			Scanner in = new Scanner(System.in);
			System.out.println("Enter empid to be deelted");
			int id = in.nextInt();
			String sql = "delete from wework where eid = "+id;
			System.out.println(sql);
			int count=st.executeUpdate(sql);
			
			if (count==1)
				System.out.println("Record deleted");
			else
				System.out.println("Record not deleted");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	
} 