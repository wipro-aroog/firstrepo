package db;
import java.sql.*;
public class db {

	public static void main(String[] args) {
		//insert
		
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
			System.out.println("Error");
			e.printStackTrace();
		}
		
		//Create a Statement object
		try {
			Statement st = con.createStatement();
			String sql = "insert into wework values ('Snow', 300, 'Manager', 45679.40)";
			
			int count = st.executeUpdate(sql);
			
			if(count == 1)
				System.out.println("Record inserted");
			else
				System.out.println("Record not inserted");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	
} 
 