package emp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginDao 
{
	public static boolean validate(emp.bean.User bean) 
	{ 
		boolean status = false; 
		try 
		{ 
			Class.forName("com.mysql.cj.jdbc.Driver"); 
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/emp_jsp", "root", "keerthana@26"); 
			PreparedStatement ps = con.prepareStatement("select name,password from register where name=? and password=?"); 
			ps.setString(1, bean.getName()); 
			ps.setString(2, bean.getPassword()); 
			ResultSet rs = ps.executeQuery(); 
			status = rs.next(); 
		} 
		catch (Exception e) 
		{ 
			e.printStackTrace(); 
		} 
		return status; 
	}
}
