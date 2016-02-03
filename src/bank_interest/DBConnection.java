package bank_interest;

import java.sql.*;
public class DBConnection {

	static final String driver="com.mysql.jdbc.Driver";
	static final String db_url="jdbc:mysql://localhost:3306/bank";
	static final String user="root";
	static final String pass = "root";
	Statement stmt=null;
	Connection conn=null;
	void connectDB(){
		
	
	 try {
		Class.forName(driver);
		System.out.println("connecting to DB");
		conn = DriverManager.getConnection(db_url,user,pass);
		System.out.println("Creating statement...");
		stmt=conn.createStatement();
		String query="SELECT * FROM bank";
		ResultSet rs=stmt.executeQuery(query);
		System.out.print("ID|Bank");
		System.out.println();
		while(rs.next()){
	         //Retrieve by column name
	         int id  = rs.getInt("id");
	         String bank = rs.getString("bank");
	         //Display values
	         
	         System.out.print(id +"|");
	         System.out.println(bank);
	      }
		
	} catch (ClassNotFoundException e) {
		
		e.printStackTrace();
	} catch (SQLException e) {
		
		e.printStackTrace();
	}
	
	 finally{
		 try{
	         if(stmt!=null)
	            stmt.close();
	      }catch(SQLException se2){
	      }
		 
		 try{
	         if(conn!=null)
	            conn.close();
	      }catch(SQLException se){
	         se.printStackTrace();
	      }
		 
	 }
	 
	}
}
