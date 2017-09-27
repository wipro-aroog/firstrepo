package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class select {

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
			System.out.println("Enter empid to find");
			int id = in.nextInt();
			
			
			String sql = "select * from wework where eid ="+id;
			System.out.println(sql);
			ResultSet rs = st.executeQuery(sql);
			boolean flag = false;
			while(rs.next())
			{
				System.out.println("Name = "+rs.getString(1));
				System.out.println("ID = "+ rs.getInt("eid"));
				System.out.println("Designation = "+rs.getString(3));
				System.out.println("Salary = "+rs.getFloat(4));
			}
			
			if (!flag)
				System.out.println("Record not found");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
	