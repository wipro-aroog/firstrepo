package db;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class update {

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
			System.out.println("Enter empid to be updated");
			int id = in.nextInt();
			System.out.println("Enter salary to be updated:");
			float salary = in.nextFloat();
			String sql = "update wework set salary ="+salary+" where eid="+id;
			System.out.println(sql);
			int count=st.executeUpdate(sql);
			
			if (count==1)
				System.out.println("Record updated");
			else
				System.out.println("Record not updated");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	
} 


